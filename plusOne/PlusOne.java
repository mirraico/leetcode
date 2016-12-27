package com.mirraico.leetcode;

public class PlusOne {
	
	public int[] plusOne(int[] digits) {
		int carry = 0;
		digits[digits.length - 1] += 1;
		for(int i = digits.length - 1; i >= 0; i--) {
			digits[i] = digits[i] + carry;
			if(digits[i] >= 10) {
				digits[i] -= 10;
				carry = 1;
			} else {
				carry = 0;
				break;
			}
		}
		if(carry == 1) {
			int ans[] = new int[digits.length + 1];
			ans[0] = 1; ans[1] = digits[0];
			System.arraycopy(digits, 1, ans, 2, digits.length - 1);
			return ans;
		} else return digits;
	}

	public static void main(String[] args) {
	}
	

}
