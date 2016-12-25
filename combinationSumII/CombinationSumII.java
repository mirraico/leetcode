package com.mirraico.leetcode;

import java.util.*;

public class CombinationSumII {
	
	public void quickSort(int nums[], int l, int r) {
		if(r - l <= 1) return;
		int mid = nums[l];
		int p = l, q = r - 1, tmp;
		while(p < q) {
			while(p < q && nums[q] >= mid) q--;
			if(p >= q) break;
			tmp = nums[p]; nums[p] = nums[q]; nums[q] = tmp;
			while(p < q && nums[p] <= mid) p++;
			if(p >= q) break;
			tmp = nums[p]; nums[p] = nums[q]; nums[q] = tmp;
		}
		this.quickSort(nums, l, p);
		this.quickSort(nums, p + 1, r);
	}
	
	public void combine(int[] candidates, int pos, int target, int count,
			List<Integer> tmpAns, List<List<Integer>> ans) {
		if(count > target) return;
		if(count == target) {
			List<Integer> cloneAns = new ArrayList<>(tmpAns);
			ans.add(cloneAns);
			return;
		}
		if(pos >= candidates.length) return;
		for(int i = pos; i < candidates.length; i++) {
			if(i > pos && candidates[i] == candidates[i-1]) continue;
			tmpAns.add(candidates[i]);
			this.combine(candidates, i + 1, target, count + candidates[i], tmpAns, ans);
			tmpAns.remove(tmpAns.size() - 1);
		}
	}
	
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		this.quickSort(candidates, 0, candidates.length);
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> tmpAns = new ArrayList<>();
		this.combine(candidates, 0, target, 0, tmpAns, ans);
		return ans;
	}

	public static void main(String[] args) {
		int[] nums = {1};
		new Solution().combinationSum2(nums, 1);
	}

}
