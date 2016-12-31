package com.mirraico.leetcode;

public class RemoveDuplicatesfromSortedArrayII {
	
	public int removeDuplicates(int[] nums) {
		if(nums.length == 0 || nums.length == 1) return nums.length;
		boolean dup = false;
		int i = 1, j = 1;
		while(i < nums.length) {
			if(nums[i] == nums[i-1]) {
				if(dup) {
					i++;
					continue;
				} else {
					dup = true;
				}
			} else {
				dup = false;
			}
			nums[j++] = nums[i++];
		}
		return j;
	}
	
	public static void main(String[] args) {
		int[] nums = {1,1,1,2,2,3};
		System.out.println(new Solution().removeDuplicates(nums));
	}
}
