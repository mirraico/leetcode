package com.mirraico.leetcode;

public class UniqueBinarySearchTrees {
	
	public int numTrees(int n) {
		if(n == 0 || n == 1 || n == 2) return n;
		int dp[] = new int[n+1];
		dp[1] = 1; dp[2] = 2;
		for(int i = 3; i <= n; i++) {
			dp[i] += dp[i-1] * 2; // j = 1 & j = i
			for(int j = 2; j < i; j++) {
				dp[i] += dp[j-1] * dp[i-j];
			}
		}
		return dp[n];
	}
	
	public static void main(String[] args) {
		System.out.println(new Solution().numTrees(3));
	}
}
