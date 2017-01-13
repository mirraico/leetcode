package com.mirraico.leetcode;

public class ConstructBinaryTreefromInorderandPostorderTraversal {
	
	public TreeNode build(int[] inorder, int[] postorder, int pos, int l, int r) {
		if(pos < 0 || l >= r) return null;
		TreeNode root = new TreeNode(postorder[pos]);
		int mid = 0;
		for(int i = l; i < r; i++) {
			if(inorder[i] == postorder[pos]) {
				mid = i;
				break;
			}
		}
		root.left = this.build(inorder, postorder, pos - (r - mid), l, mid);
		root.right = this.build(inorder, postorder, pos - 1, mid + 1, r);
		
		return root;
	}
	
	public TreeNode buildTree(int[] inorder, int[] postorder) {
		return this.build(inorder, postorder, postorder.length - 1, 0, inorder.length);
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