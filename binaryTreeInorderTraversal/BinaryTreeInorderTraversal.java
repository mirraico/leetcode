package com.mirraico.leetcode;

import java.util.*;

public class BinaryTreeInorderTraversal {
	
	public void dfs(TreeNode t, List<Integer> ans) {
		if(t == null) return;
		this.dfs(t.left, ans);
		ans.add(t.val);
		this.dfs(t.right, ans);
	}
	
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> ans = new ArrayList<>();
		this.dfs(root, ans);
		return ans;
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