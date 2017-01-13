package com.mirraico.leetcode;

import java.util.*;

public class Binary TreeLevelOrderTraversal {
	
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> ans = new ArrayList<>();
		if(root == null) return ans;
		LinkedList<TreeNode> queue = new LinkedList<>();
		queue.addLast(root);
		while(!queue.isEmpty()) {
			List<Integer> tmpAns = new ArrayList<>();
			int levelNum = queue.size();
			while((levelNum--) != 0) {
				TreeNode tn = queue.removeFirst();
				tmpAns.add(tn.val);
				if(tn.left != null) {
					queue.addLast(tn.left);
				}
				if(tn.right != null) {
					queue.addLast(tn.right);
				}
			}
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