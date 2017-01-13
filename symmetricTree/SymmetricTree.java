package com.mirraico.leetcode;

public class SymmetricTree {
	
	public boolean dfs(TreeNode p, TreeNode q) {
		if(p == null || q == null) {
			return p == null && q == null;
		}
		if(p.val != q.val) return false;
		return dfs(p.left, q.right) && dfs(p.right, q.left);
	}
	
	public boolean isSymmetric(TreeNode root) {
		if(root == null) return true;
		return dfs(root.left, root.right);
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