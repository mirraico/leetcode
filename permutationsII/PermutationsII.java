package com.mirraico.leetcode;

import java.util.*;

public class PermutationsII {
	
	public void convert(int[] nums, int pos, List<List<Integer>> ans) {
		List<Integer> tmpAns = new ArrayList<>();
		for(int i = 0; i < nums.length; i++) {
			tmpAns.add(nums[i]);
		}
		for(int i = 0; i < ans.size(); i++) {
			boolean diff = false;
			List<Integer> hasAns = ans.get(i);
			for(int j = 0; j < hasAns.size(); j++) {
				if(tmpAns.get(j) != hasAns.get(j)) {
					diff = true; break;
				}
			}
			if(!diff) return;
		}
		ans.add(tmpAns);
		if(pos >= nums.length - 1) return;
		int tmp;
		for(int i = pos; i < nums.length - 1; i++) {
			for(int j = i + 1; j < nums.length; j++) {
				if(nums[i] == nums[j]) continue;
				tmp = nums[i]; nums[i] = nums[j]; nums[j] = tmp;
				this.convert(nums, i + 1, ans);
				tmp = nums[i]; nums[i] = nums[j]; nums[j] = tmp;
			}
		}
		
	}
	
	public List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> ans = new ArrayList<>();
		this.convert(nums, 0, ans);
		return ans;
	}

	public static void main(String[] args) {
		int[] nums = {2, 2, 1, 1};
		new Solution().permuteUnique(nums);
	}

}
