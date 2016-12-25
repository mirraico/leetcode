package com.mirraico.leetcode;

import java.util.*;

public class CombinationSum {
	
	public void combine(int[] candidates, int pos, int target, int count,
			List<Integer> tmpAns, List<List<Integer>> ans) {
		if(count > target) return;
		if(count == target) {
			List<Integer> cloneAns = new ArrayList<>(tmpAns);
			ans.add(cloneAns);
			return;
		}
		for(int i = pos; i < candidates.length; i++) {
			tmpAns.add(candidates[i]);
			this.combine(candidates, i, target, count + candidates[i], tmpAns, ans);
			tmpAns.remove(tmpAns.size() - 1);
		}
	}
	
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> tmpAns = new ArrayList<>();
		this.combine(candidates, 0, target, 0, tmpAns, ans);
		return ans;
	}

	public static void main(String[] args) {
	}

}
