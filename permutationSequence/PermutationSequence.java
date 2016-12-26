package com.mirraico.leetcode;

public class PermutationSequence {
	
	public String getPermutation(int n, int k) {
		StringBuilder ans = new StringBuilder();
		boolean used[] = new boolean[n];
		k -= 1;
		for(int i = 0; i < n; i++) {
			int lev = 1;
			for(int j = 2; j < n - i; j++) {
				lev *= j;
			}
			int num = k / lev, cnt = -1;
			for(int j = 0; j < n; j++) {
				if(!used[j]) cnt++;
				if(cnt == num) {
					used[j] = true;
					ans.append((j + 1));
					k %= lev;
					break;
				}
			}
		}
		return ans.toString();
	}

	public static void main(String[] args) {
		System.out.println(new Solution().getPermutation(3, 6));
	}

}
