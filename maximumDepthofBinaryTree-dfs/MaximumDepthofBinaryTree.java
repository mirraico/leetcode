package com.mirraico.leetcode;

public class Maximum DepthofBinaryTree {
	
	public int maxDepth(TreeNode root) {
		return root == null ? 0 : Math.max(this.maxDepth(root.left), this.maxDepth(root.right)) + 1;
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