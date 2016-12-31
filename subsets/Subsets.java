package com.mirraico.leetcode;

import java.util.*;

public class Subsets {
	
	public void dfs(int st, int[] nums, List<Integer> tmpAns, List<List<Integer>> ans) {
		
		ans.add(new ArrayList<>(tmpAns));
		if(st == nums.length) {
			return;
		}
		
		for(int i = st; i < nums.length; i++) {
			tmpAns.add(nums[i]);
			this.dfs(i + 1, nums, tmpAns, ans);
			tmpAns.remove(tmpAns.size() - 1);
		}
	}
	
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> tmpAns = new ArrayList<>();
		Arrays.sort(nums);
		this.dfs(0, nums, tmpAns, ans);
		return ans;
	}

}
