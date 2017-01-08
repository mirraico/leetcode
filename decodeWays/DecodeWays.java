package com.mirraico.leetcode;

public class DecodeWays {
	
	public boolean judge1(char c) {
		return c >= '1' && c <= '9' ? true : false;
	}
	
	public boolean judge2(char c1, char c2) {
		if(c1 == '1' || (c1 == '2' && c2 >= '0' && c2 <= '6')) {
			return true;
		} else {
			return false;
		}
	}
	
	public int numDecodings(String s) {
		if(s.length() == 0) return 0;
		if(s.length() == 1) {
			return judge1(s.charAt(0)) ? 1 : 0;
		}
		
		int[] dp = new int[s.length() + 1];
		dp[0] = judge1(s.charAt(0)) ? 1 : 0;
		dp[1] = (judge1(s.charAt(1)) ? dp[0] : 0) + (judge2(s.charAt(0), s.charAt(1)) ? 1 : 0);
		for(int i = 2; i < s.length(); i++) {
			dp[i] = (judge1(s.charAt(i)) ? dp[i-1] : 0) + (judge2(s.charAt(i-1), s.charAt(i)) ? dp[i-2] : 0);
		}
		return dp[s.length() - 1];
	}
	
	public static void main(String[] args) {
	}
}
