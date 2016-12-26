package com.mirraico.leetcode;

public class Pow {
	
	/** 
	 * Time Limit Exceeded
	public double myPow(double x, int n) {
		
		if(n == 0) return 1;
		else if(n == 1) return x;
		else if(n == -1) return 1 / x;
		boolean minus = false;
		if(n < 0) {
			n = -n; minus = true;
		}
		
		int digit = 1, dicnt = 1;
		while(2*digit <= n) { digit *= 2; dicnt++; }
		double[] tmpPow = new double[dicnt];
		tmpPow[0] = x;
		for(int i = 1; i < tmpPow.length; i++) {
			tmpPow[i] = tmpPow[i-1] * tmpPow[i-1];
		}
		
		double ans = 1;
		while(n > 0) {
			while(n < digit){ digit /= 2; dicnt--; }
			ans *= tmpPow[dicnt-1];
			n -= digit;
		}
		return minus ? 1 / ans : ans;
	}
	*/
	
	public double pow(double x, int n) {
		if(n == 0) return 1;
		if(n == 1) return x;
		double tmp = pow(x, n/2);
		if(n % 2 == 0) return tmp * tmp;
		else return tmp * tmp * x;
	}
	
	public double myPow(double x, int n) {
		if(n == 0) return 1;
		else if(n == 1) return x;
		else if(n == -1) return 1 / x;
		boolean minus = false;
		if(n < 0) {
			n = -n; minus = true;
		}
		return minus ? 1 / pow(x, n) : pow(x, n);
	}

	public static void main(String[] args) {
		System.out.println(new Solution().myPow(2, 3));
	}

}
