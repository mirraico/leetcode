package com.mirraico.leetcode;

public class MaximumSubarray {
	
	public int maxSubArray(int[] nums) {
		int ans = nums[0], tmp = nums[0];
		for(int i = 1; i < nums.length; i++) {
			if(tmp < 0) tmp = nums[i];
			else tmp += nums[i];
			if(tmp > ans) ans = tmp;
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] nums = {-1, -2};
		System.out.println(new Solution().maxSubArray(nums));
	}

}
