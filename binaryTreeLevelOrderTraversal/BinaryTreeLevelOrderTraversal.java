package com.mirraico.leetcode;

import java.util.*;

public class BinaryTreeLevelOrderTraversal {
	
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> ans = new ArrayList<>();
		if(root == null) return ans;
		LinkedList<TreeNode> queue = new LinkedList<>();
		queue.addLast(root);
		int thisNum = 1, nextNum = 0;
		while(!queue.isEmpty()) {
			List<Integer> tmpAns = new ArrayList<>();
			while((thisNum--) != 0) {
				TreeNode tn = queue.removeFirst();
				tmpAns.add(tn.val);
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
			ans.add(tmpAns);
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