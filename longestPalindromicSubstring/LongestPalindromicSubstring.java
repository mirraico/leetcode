package com.mirraico.leetcode;

public class LongestPalindromicSubstring {

	public String longestPalindrome(String s) {
		if(s.length() == 0) return "";
		boolean dp[][] = new boolean[s.length()][s.length()];
		int maxLen = 0, p = 0, q = 0;
		for(int j = 0; j < s.length(); j++) {
			dp[j][j] = true;
			for(int i = j - 1; i >= 0; i--) {
				if(s.charAt(i) == s.charAt(j) && (dp[i+1][j-1] || i+1 == j)) {
					dp[i][j] = true;
					if(j - i + 1 >  maxLen) {
						maxLen = j - i + 1;
						p = i; q = j;
					}
				}
			}
		}
        return s.substring(p, q + 1);
    }
	
	public static void main(String[] args) {
		System.out.println(new Solution().longestPalindrome("cbbd"));
	}

}
