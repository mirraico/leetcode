package com.mirraico.leetcode;

public class MultiplyStrings {
	
	public String multiply(String num1, String num2) {
		int len1 = num1.length(), len2 = num2.length();
		int[] tmp = new int[len1 + len2];
		for(int i = len1 - 1; i >= 0; i--) {
			for(int j = len2 - 1; j >= 0; j--) {
				tmp[len1 + len2 - i - j - 2] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
			}
		}
		for(int i = 0; i < tmp.length - 2; i++) {
			tmp[i+1] += tmp[i] / 10;
			tmp[i] %= 10;
		}
		StringBuilder sb = new StringBuilder();
		boolean st = false;
		for(int i = tmp.length - 2; i >= 0; i--) {
			if(st || tmp[i] != 0) {
				st = true;
				sb.append(tmp[i]);
			}
		}
		return sb.length() != 0 ? sb.toString() : "0";
	}

	public static void main(String[] args) {
		System.out.println(new Solution().multiply("999", "999"));
	}

}
