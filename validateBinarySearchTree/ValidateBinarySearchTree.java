package com.mirraico.leetcode;

public class ValidateBinarySearchTree {
	
	public boolean judge(TreeNode root, Integer min, Integer max) {
		if(root == null) return true;
		if(min != null && root.val <= min) return false;
		if(max != null && root.val >= max) return false;
		if(root.left != null && root.left.val >= root.val) return false;
		if(root.right != null && root.right.val <= root.val) return false;
		if(!judge(root.left, min, root.val) || !judge(root.right, root.val, max)) return false;
		return true;
	}
	
	public boolean isValidBST(TreeNode root) {
		return judge(root, null, null);
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