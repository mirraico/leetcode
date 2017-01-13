package com.mirraico.leetcode;

import java.util.*;

public class MaximumDepthofBinaryTree {
	
	public int maxDepth(TreeNode root) {
		int ans = 0;
		if(root == null) return ans;
		LinkedList<TreeNode> queue = new LinkedList<>();
		queue.addLast(root);
		int thisNum = 1, nextNum = 0;
		while(!queue.isEmpty()) {
			LinkedList<Integer> tmpAns = new LinkedList<>();
			while((thisNum--) != 0) {
				TreeNode tn = queue.removeFirst();
				if(tn.left != null) {
					queue.addLast(tn.left);
					nextNum++;
				}
				if(tn.right != null) {
					queue.addLast(tn.right);
					nextNum++;
				}
			}
			thisNum = nextNum; nextNum = 0;
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