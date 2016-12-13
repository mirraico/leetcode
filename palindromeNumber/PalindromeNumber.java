package com.mirraico.leetcode;

public class PalindromeNumber {

	public boolean isPalindrome(int x) {
		if(x < 0) return false;
		int digit = 1;
		while(x / digit >= 10) {
			digit *= 10;
		}
		while(x != 0) {
			if(x % 10 != x / digit) return false;
			x %= digit;
			x /= 10;
			digit /= 100;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(new Solution().isPalindrome(123421));
	}

}
