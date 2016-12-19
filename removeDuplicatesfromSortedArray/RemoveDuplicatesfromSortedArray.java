package com.mirraico.leetcode;

public class RemoveDuplicatesfromSortedArray {
	
	public int removeDuplicates(int[] nums) {
		int cnt = 1;
		for(int i = 1; i < nums.length; i++) {
			if(nums[i] != nums[i-1]) nums[cnt++] = nums[i];
		}
		return cnt;
	}

	public static void main(String[] args) {
		int[] nums = {1, 2, 3};
		System.out.println(new Solution().removeDuplicates(nums));
	}

}
