package com.mirraico.leetcode;

public class SearchInsertPosition {
	
	public int searchInsert(int[] nums, int target) {
		int pos;
		for(pos = 0; pos < nums.length; pos++) {
			if(target <= nums[pos]) return pos;
		}
		return nums.length;
	}

	public static void main(String[] args) {
	}

}
