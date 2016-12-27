package com.mirraico.leetcode;

public class Sqrt {
	
	public int mySqrt(int x) {
		if(x == 0 || x == 1) return x;
		long l = 0, r = x;
		while(r - l > 1) {
			long mid = (l + r) / 2;
			if(mid * mid == x) return new Long(mid).intValue();
			else if(mid * mid > x) r = mid;
			else l = mid;
		}
		return new Long(l).intValue();
	}

	public static void main(String[] args) {
		System.out.println(new Solution().mySqrt(2147395599));
	}
	
}
