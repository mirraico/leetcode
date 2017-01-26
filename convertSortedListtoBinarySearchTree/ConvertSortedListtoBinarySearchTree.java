package com.mirraico.leetcode;

public class ConvertSortedListtoBinarySearchTree {
	
	public TreeNode build(int[] nums, int l, int r) {
		if(l >= r) return null;
		int mid = (l + r) / 2;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = this.build(nums, l, mid);
		root.right = this.build(nums, mid + 1, r);
		return root;
	}
	
	public TreeNode sortedListToBST(ListNode head) {
		int len = 0;
		ListNode p = head;
		while(p != null) {
			p = p.next;
			len += 1;
		}
		int nums[] = new int[len];
		p = head;
		int i = 0;
		while(p != null) {
			nums[i] = p.val;
			p = p.next;
			i += 1;
		}
		return build(nums, 0, nums.length);
	}
	
	public static void main(String[] args) {
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; next = null; }
}
