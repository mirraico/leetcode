package com.mirraico.leetcode;

public class SearchinRotatedSortedArray {
	
	public int search(int[] nums, int target) {
		int l = 0, r = nums.length - 1, mid;
		while(l <= r) {
			mid = (l + r) / 2;
			if(target == nums[mid]) return mid;
			if(nums[l] < nums[r]) {
				if (target > nums[mid]) l = mid + 1;
				else r = mid - 1;
			} else if(nums[mid] >= nums[l]) {
				if(target >= nums[l] && target < nums[mid]) r = mid - 1;
				else l = mid + 1;
			} else {
				if(target > nums[mid] && target <= nums[r]) l = mid + 1;
				else r = mid - 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] nums = {3, 4, 1, 2};
		System.out.println(new Solution().search(nums, 3));
	}
}
