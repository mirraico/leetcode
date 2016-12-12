package com.mirraico.leetcode;

public class StringtoInteger {

	public int myAtoi(String str) {
		str = str.trim();
		if(str.length() == 0) return 0;
		long ans = 0;
		boolean minus = false;
		int i = 0; 
		if(str.charAt(i) == '+') i++;
		else if(str.charAt(i) == '-') { minus = true; i++; }
		else if(str.charAt(i) >= '0' && str.charAt(i) <= '9') ;
		else return 0;
		
		for(; i < str.length(); i++) {
			if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				ans = ans * 10 + (str.charAt(i) - '0');
				if(minus ? -ans < Integer.MIN_VALUE : ans > Integer.MAX_VALUE)
					return minus ? Integer.MIN_VALUE : Integer.MAX_VALUE;
			} else {
				return new Long(minus ? -ans : ans).intValue();
			}
		}
		
		return new Long(minus ? -ans : ans).intValue();
	}
	
	public static void main(String[] args) {
	}

}
