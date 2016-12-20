package com.mirraico.leetcode;

public class NextPermutation {
	
	public void nextPermutation(int[] nums) {
		if(nums.length == 1) return;
		int i, j, tmp; 
		boolean last = true;
		for(i = nums.length - 2; i >= 0; i--) {
			if(nums[i] < nums[i+1]) {
				last = false;
				break;
			}
		}
		if(last) {
			i = 0; j =nums.length - 1;
		} else {
			for(j = nums.length - 1; j > i; j--) {
				if(nums[j] > nums[i]) break;
			}
			tmp = nums[i]; nums[i] = nums[j]; nums[j] = tmp;
			i += 1; j =nums.length - 1;
		}
		
		while(i < j) {
			tmp = nums[i]; nums[i] = nums[j]; nums[j] = tmp;
			i++; j--;
		}
	}

	public static void main(String[] args) {
	}

}
