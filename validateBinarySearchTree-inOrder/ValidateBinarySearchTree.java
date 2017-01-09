package com.mirraico.leetcode;

import java.util.*;

public class ValidateBinarySearchTree {
	
	public List<Integer> order = new ArrayList<>();
	
	public void inOrder(TreeNode root) {
		if(root == null) return;
		this.inOrder(root.left);
		order.add(root.val);
		this.inOrder(root.right);
	}
	
	public boolean isValidBST(TreeNode root) {
		this.inOrder(root);
		for(int i = 0; i < order.size() - 1; i++) {
			if(order.get(i) >= order.get(i+1)) return false;
		}
		return true;
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