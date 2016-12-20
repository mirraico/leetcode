package com.mirraico.leetcode;

public class DivideTwoIntegers {
	
	public int divide(int dividend, int divisor) {
		boolean minus = false;
		long a = dividend, b = divisor, n = 1;
		long ans = 0;
		if(a < 0) {
			minus = !minus; a = -a;
		}
		if(b < 0) {
			minus = !minus; b = -b;
		}
		if(b == 1) {
			ans = minus ? -ans : ans;
			return ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE ? Integer.MAX_VALUE : new Long(ans).intValue();
		}
		while(a >= (b<<1)) {
			b <<= 1; n <<= 1;
		}
		while(n != 0) {
			if(a >= b) {
				a -= b;
				ans += n;
			}
			b >>= 1; n >>= 1;
		}
		
		ans = minus ? -ans : ans;
		return ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE ? Integer.MAX_VALUE : new Long(ans).intValue();
	
	}

	public static void main(String[] args) {
		System.out.println(new Solution().divide(-2, 2));
	}

}
