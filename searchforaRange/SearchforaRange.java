package com.mirraico.leetcode;

public class SearchforaRange {
	
	public int searchLeft(int[] nums, int target, int l, int r) {
		if(l == r) {
			if(nums[l] == target) return l;
			else return -1;
		}
		int mid = (l + r) / 2;
		if(nums[mid] >= target) {
			return this.searchLeft(nums, target, l, mid);
		} else {
			return this.searchLeft(nums, target, mid + 1, r);
		}
	}
	
	public int searchRight(int[] nums, int target, int l, int r) {
		if(l == r) {
			if(nums[l] == target) return l;
			else return -1;
		}
		int mid = (l + r + 1) / 2;
		if(nums[mid] <= target) {
			return this.searchRight(nums, target, mid, r);
		} else {
			return this.searchRight(nums, target, l, mid - 1);
		}
	}
	
	public int[] searchRange(int[] nums, int target) {
		int[] ans = new int[2];
		int l = 0, r = nums.length - 1;
		ans[0] = this.searchLeft(nums, target, l, r);
		ans[1] = this.searchRight(nums, target, l, r);
		return ans;
	}

	public static void main(String[] args) {
		int nums[] = {1, 2, 2, 3};
		System.out.println(new Solution().searchRange(nums, 2)[0]);
		System.out.println(new Solution().searchRange(nums, 2)[1]);
	}

}
