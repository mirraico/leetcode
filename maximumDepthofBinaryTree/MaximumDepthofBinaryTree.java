package com.mirraico.leetcode;

import java.util.*;

public class MaximumDepthofBinaryTree {
	
	public int maxDepth(TreeNode root) {
		int ans = 0;
		if(root == null) return ans;
		LinkedList<TreeNode> queue = new LinkedList<>();
		queue.addLast(root);
		while(!queue.isEmpty()) {
			LinkedList<Integer> tmpAns = new LinkedList<>();
			int levelNum = queue.size();
			while((levelNum--) != 0) {
				TreeNode tn = queue.removeFirst();
				if(tn.left != null) {
					queue.addLast(tn.left);
				}
				if(tn.right != null) {
					queue.addLast(tn.right);
				}
			}
			ans++;
		}
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