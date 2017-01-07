package com.mirraico.leetcode;

import java.util.*;

public class GrayCode {
	
	public List<Integer> grayCode(int n) {
		List<Integer> ans = new ArrayList<>();
		ans.add(0);
		if(n == 0) return ans;
		ans.add(1);
		int high = 1;
		for(int i = 2; i <= n; i++) {
			high *= 2;
			for(int j = ans.size() - 1; j >= 0; j--) {
				ans.add(high + ans.get(j));
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		System.out.println(new Solution().grayCode(3));
	}
}
