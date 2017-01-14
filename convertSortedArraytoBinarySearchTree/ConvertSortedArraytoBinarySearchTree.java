package com.mirraico.leetcode;

public class ConvertSortedArraytoBinarySearchTree {
	
	public TreeNode build(int[] nums, int l, int r) {
		if(l >= r) return null;
		int mid = (l + r) / 2;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = this.build(nums, l, mid);
		root.right = this.build(nums, mid + 1, r);
		return root;
	}
	
	public TreeNode sortedArrayToBST(int[] nums) {
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