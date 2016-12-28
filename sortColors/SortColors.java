package com.mirraico.leetcode;

public class SortColors {
	
	public void sortColors(int[] nums) {
		int r = 0, w = 0, b = 0, i;
		for(i = 0; i < nums.length; i++) {
			if(nums[i] == 0) r++;
			else if(nums[i] == 1) w++;
			else b++;
		}
		i = 0;
		while((r--) != 0) nums[i++] = 0;
		while((w--) != 0) nums[i++] = 1;
		while((b--) != 0) nums[i++] = 2;
	}

	public static void main(String[] args) {
	}
	
}
