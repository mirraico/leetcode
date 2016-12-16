package com.mirraico.leetcode;

import java.util.*;

public class FourSum {

	public void sort(int[] nums, int l, int r) {
		if(r - l <= 1) return;
		int mid = nums[l];
		int p = l, q = r - 1;
		while(p != q) {
			for(; q != p; q--) {
				if(nums[q] < mid) {
					int tmp = nums[p];
					nums[p] = nums[q];
					nums[q] = tmp;
					break;
				}
			}
			for(; p != q; p++) {
				if(nums[p] > mid) {
					int tmp = nums[p];
					nums[p] = nums[q];
					nums[q] = tmp;
					break;
				}
			}
		}
		sort(nums, l, p);
		sort(nums, p + 1, r);
	}
	
	public List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> ans = new ArrayList<>();
		this.sort(nums, 0, nums.length);
		for(int i = 0; i < nums.length - 3; i++) {
			if(i > 0 && nums[i] == nums[i-1]) continue;
			if(nums[i] + nums[i+1] + nums[i+2] + nums[i+3] > target) continue;
			if(nums[i] + nums[nums.length-1] + nums[nums.length-2] + nums[nums.length-3] < target) continue;
			for(int j = i + 1; j < nums.length - 2; j++) {
				if(j > i + 1 && nums[j] == nums[j-1]) continue;
				int tot = nums[i] + nums[j];
				if(tot + nums[j+1] + nums[j+2] > target) continue;
				if(tot + nums[nums.length-1] + nums[nums.length-2] < target) continue;
				int p = j + 1, q = nums.length - 1;
				while(p < q) {
					if(p > j + 1 && nums[p] == nums[p-1]) { p++; continue; }
					if(q > nums.length - 1 && nums[q] == nums[q+1]) { q--; continue; }
					if(nums[p] + nums[q] + tot == target) {
						List<Integer> tmpAns = new ArrayList<>();
						tmpAns.add(nums[i]);
						tmpAns.add(nums[j]);
						tmpAns.add(nums[p]);
						tmpAns.add(nums[q]);
						ans.add(tmpAns);
					}
					if(nums[p] + nums[q] + tot > target) q--;
					else p++;
				}
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int[] nums = {5, 5, 3, 5, 1, -5, 1, -2};
		System.out.println(new Solution().fourSum(nums, 4));
	}

}
