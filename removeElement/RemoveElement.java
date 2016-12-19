package com.mirraico.leetcode;

public class RemoveElement {
	
	public int removeElement(int[] nums, int val) {
		int cnt = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] != val) nums[cnt++] = nums[i];
		}
		return cnt;
	}

	public static void main(String[] args) {
	}

}
