package com.mirraico.leetcode;

public class ReverseInteger {

	public int reverse(int x) {
        try {return Integer.parseInt(x >= 0 ? new StringBuilder(x+"").reverse().toString()
        		: "-" + new StringBuilder(-x+"").reverse().toString()); }
        catch(NumberFormatException e) { return 0; } finally{}
    }
	
	public static void main(String[] args) {
		System.out.println(new Solution().reverse(1534236469));
	}

}
