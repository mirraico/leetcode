package com.mirraico.leetcode;

public class JumpGame {
	
	public boolean canJump(int[] nums) {
		int max = nums[0];
		if(max >= nums.length - 1) return true;
		for(int i = 1; i <= max; i++) {
			if(i + nums[i] > max) {
				max = i + nums[i];
				if(max >= nums.length - 1) return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] nums = {1,2,3};
		System.out.println(new Solution().canJump(nums));
	}

}
