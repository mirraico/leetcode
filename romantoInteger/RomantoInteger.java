package com.mirraico.leetcode;

public class RomantoInteger {

	public int toNum(char ch) {
		switch(ch) {
			case 'I': return 1;
			case 'V': return 5;
			case 'X': return 10;
			case 'L': return 50;
			case 'C': return 100;
			case 'D': return 500;
			case 'M': return 1000;
		}
		return 0;
	}
	
	public int romanToInt(String s) {
		int ans = 0;
		for(int i = 0; i < s.length(); i++) {
			int j = i + 1;
			if(j < s.length()) {
				if(this.toNum(s.charAt(i)) < this.toNum(s.charAt(j))) {
					ans += (this.toNum(s.charAt(j)) - this.toNum(s.charAt(i)));
					i += 1;
				} else {
					ans += this.toNum(s.charAt(i));
				}
			} else {
				ans += this.toNum(s.charAt(i));
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		System.out.println(new Solution().romanToInt("DCXXI"));
	}

}
