package com.mirraico.leetcode;

import java.util.*;

public class ThreeSum {

	public void quickSort(int[] nums, int s, int e) {
		if(e - s <= 1) return;
		int mid = nums[s], tmp;
		int i = s, j = e - 1;
		while(i != j) {
			for(; j != i; j--) {
				if(nums[j] < mid) {
					tmp = nums[i]; nums[i] = nums[j]; nums[j] = tmp;
					break;
				}
			}
			for(; i != j; i++) {
				if(nums[i] > mid) {
					tmp = nums[i]; nums[i] = nums[j]; nums[j] = tmp;
					break;
				}
			}
		}
		quickSort(nums, s, i);
		quickSort(nums, i + 1, e);
	}
	
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> ans = new ArrayList<>();
		this.quickSort(nums, 0, nums.length);
		for(int i = 0; i < nums.length; i++) {
			if(i > 0 && nums[i] == nums[i-1]) continue;
			int target = nums[i];
			int p = i + 1, q = nums.length - 1;
			while(p < q) {
				if(p > i + 1 && nums[p] == nums[p-1]) {
					p++;
					continue;
				}
				if(q < nums.length - 1 && nums[q] == nums[q+1]) {
					q--;
					continue;
				}
				if(nums[p] + nums[q] == -target) {
					List<Integer> tmpList = new ArrayList<>();
					if(i < p) {
						tmpList.add(nums[i]);
						tmpList.add(nums[p]);
						tmpList.add(nums[q]);
					} else if(i > q) {
						tmpList.add(nums[p]);
						tmpList.add(nums[q]);
						tmpList.add(nums[i]);
					} else {
						tmpList.add(nums[p]);
						tmpList.add(nums[i]);
						tmpList.add(nums[q]);
					}
					ans.add(tmpList);
				}
				if(nums[p] + nums[q] > -target) q--;
				else p++;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int[] nums = {-1, -1, -1, -1, 2, 2, 2};
		System.out.println(new Solution().threeSum(nums));
	}

}
