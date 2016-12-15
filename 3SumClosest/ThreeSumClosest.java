package com.mirraico.leetcode;

public class ThreeSumClosest {

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
	
	public int absolute(int num) {
		return num >= 0 ? num : -num;
	}
	
	public int threeSumClosest(int[] nums, int target) {
		this.quickSort(nums, 0, nums.length);
		int min = absolute(target - nums[0] - nums[1] - nums[2]);
		int ans = nums[0] + nums[1] + nums[2];
		for(int i = 0; i < nums.length; i++) {
			if(i > 0 && nums[i] == nums[i-1]) continue;
			int three = nums[i];
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
				if(absolute(target - three - nums[p] - nums[q]) < min) {
					min = absolute(target - three - nums[p] - nums[q]);
					ans = three + nums[p] + nums[q];
				}
				if(three + nums[p] + nums[q] > target) q--;
				else p++;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int[] nums = {0, 1, 1, 1};
		System.out.println(new Solution().threeSumClosest(nums, 100));
	}

}
