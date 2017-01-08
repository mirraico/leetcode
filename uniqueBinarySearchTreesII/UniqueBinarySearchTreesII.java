package com.mirraico.leetcode;

import java.util.*;

public class UniqueBinarySearchTreesII {
	
	public List<TreeNode> dfs(int l, int r) {
		List<TreeNode> tmpAns = new ArrayList<TreeNode>();
		if(l == r) {
			tmpAns.add(new TreeNode(l));
			return tmpAns;
		} else if(l > r) {
			tmpAns.add(null);
			return tmpAns;
		}
		List<TreeNode> lAns, rAns;
		for(int i = l; i <= r; i++) {
			lAns = this.dfs(l, i - 1);
			rAns = this.dfs(i + 1, r);
			for(int j = 0; j < lAns.size(); j++) {
				for(int k = 0; k < rAns.size(); k++) {
					TreeNode tmpRoot = new TreeNode(i);
					tmpRoot.left = lAns.get(j);
					tmpRoot.right = rAns.get(k);
					tmpAns.add(tmpRoot);
				}
			}
		}
		return tmpAns;
	}
	
	public List<TreeNode> generateTrees(int n) {
		if(n == 0) return new ArrayList<TreeNode>();
		return this.dfs(1, n);
	}
	
	public static void main(String[] args) {
		new Solution().generateTrees(3);
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}