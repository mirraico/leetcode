package com.mirraico.leetcode;

import java.util.*;

public class BinaryTreeZigzagLevelOrderTraversal {
	
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> ans = new ArrayList<>();
		if(root == null) return ans;
		LinkedList<TreeNode> queue = new LinkedList<>();
		queue.addLast(root);
		boolean reverse = false;
		while(!queue.isEmpty()) {
			LinkedList<Integer> tmpAns = new LinkedList<>();
			int levelNum = queue.size();
			while((levelNum--) != 0) {
				TreeNode tn = queue.removeFirst();
				if(reverse) tmpAns.addFirst(tn.val);
				else tmpAns.addLast(tn.val);
				if(tn.left != null) {
					queue.addLast(tn.left);
				}
				if(tn.right != null) {
					queue.addLast(tn.right);
				}
			}
			reverse = !reverse;
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