package com.mirraico.leetcode;

import java.util.*;

public class PermutationsII {
	
	public void dfs(int[] nums, boolean[] used, List<Integer> tmpAns, List<List<Integer>> ans) {
		
		if(tmpAns.size() == nums.length) {
			ans.add(new ArrayList<>(tmpAns));
			return;
		}
		for(int i = 0; i < nums.length; i++) {
			if(used[i]) continue;
			if(i > 0 && nums[i] == nums[i-1] && !used[i-1]) continue;
			used[i] = true;
			tmpAns.add(nums[i]);
			this.dfs(nums, used, tmpAns, ans);
			tmpAns.remove(tmpAns.size() - 1);
			used[i] = false;
		}
		
	}
	
	public List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> tmpAns = new ArrayList<>();
		boolean[] used = new boolean[nums.length];
		Arrays.sort(nums);
		this.dfs(nums, used, tmpAns, ans);
		return ans;
	}

	public static void main(String[] args) {
		int[] nums = {2, 2, 1, 1};
		new Solution().permuteUnique(nums);
	}

}
