package com.mirraico.leetcode;

import java.util.*;

public class Permutations {
	
	public void convert(int[] nums, int pos, List<List<Integer>> ans) {
		List<Integer> tmpAns = new ArrayList<>();
		for(int i = 0; i < nums.length; i++) {
			tmpAns.add(nums[i]);
		}
		ans.add(tmpAns);
		if(pos >= nums.length - 1) return;
		int tmp;
		for(int i = pos; i < nums.length - 1; i++) {
			for(int j = i + 1; j < nums.length; j++) {
				tmp = nums[i]; nums[i] = nums[j]; nums[j] = tmp;
				this.convert(nums, i + 1, ans);
				tmp = nums[i]; nums[i] = nums[j]; nums[j] = tmp;
			}
		}
		
	}
	
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> ans = new ArrayList<>();
		this.convert(nums, 0, ans);
		return ans;
	}

	public static void main(String[] args) {
		int[] nums = {1, 2, 3};
		new Solution().permute(nums);
	}

}
