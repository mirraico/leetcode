package com.mirraico.leetcode;

import java.util.*;

public class Combinations {
	
	public void dfs(int st, int n, int k, List<Integer> tmpAns, List<List<Integer>> ans) {
		if(k == 0) {
			ans.add(new ArrayList<>(tmpAns));
			return;
		}
		
		for(int i = st; i < n; i++) {
			if(n - st < k) continue;
			tmpAns.add(i + 1);
			this.dfs(i + 1, n, k - 1, tmpAns, ans);
			tmpAns.remove(tmpAns.size() - 1);
		}
	}
	
	public List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> tmpAns = new ArrayList<>();
		this.dfs(0, n, k, tmpAns, ans);
		return ans;
	}

}
