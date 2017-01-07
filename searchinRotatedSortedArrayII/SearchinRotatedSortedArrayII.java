package com.mirraico.leetcode;

public class SearchinRotatedSortedArrayII {
	
	public boolean search(int[] nums, int target) {
		int l = 0, r = nums.length - 1, mid;
		while(l <= r) {
			mid = (l + r) / 2;
			if(target == nums[mid]) return true;
			if(nums[l] < nums[r]) { //全序列递增
				if (target > nums[mid]) l = mid + 1;
				else r = mid - 1;
			} else if(nums[mid] > nums[l]) { //左序列递增
				if(target >= nums[l] && target < nums[mid]) r = mid - 1;
				else l = mid + 1;
			} else if(nums[mid] == nums[l]) { //无法判断
				l++; //反正nums[l]==nums[mid]!=target
			} else { //右序列递增
				if(target > nums[mid] && target <= nums[r]) l = mid + 1;
				else r = mid - 1;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] nums = {1, 3, 1, 1, 1};
		System.out.println(new Solution().search(nums, 3));
	}
}
