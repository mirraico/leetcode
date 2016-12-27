package com.mirraico.leetcode;

public class AddBinary {
	
	public String addBinary(String a, String b) {
		StringBuilder ans = new StringBuilder();
		int[] tmpAns = new int[Math.max(a.length(), b.length()) + 1];
		int carry = 0, p = a.length() - 1, q = b.length() - 1, cnt = 0;
		while(p >= 0 && q >= 0) {
			int tmp = a.charAt(p) - '0' + b.charAt(q) - '0' + carry;
			if(tmp > 1) {
				tmp -= 2; carry = 1;
			} else {
				carry = 0;
			}
			tmpAns[cnt++] = tmp;
			p--; q--;
		}
		while(p >= 0) {
			int tmp = a.charAt(p) - '0' + carry;
			if(tmp > 1) {
				tmp -= 2; carry = 1;
			} else {
				carry = 0;
			}
			tmpAns[cnt++] = tmp;
			p--;
		}
		while(q >= 0) {
			int tmp = b.charAt(q) - '0' + carry;
			if(tmp > 1) {
				tmp -= 2; carry = 1;
			} else {
				carry = 0;
			}
			tmpAns[cnt++] = tmp;
			q--;
		}
		if(carry == 1) ans.append(1);
		for(int i = cnt - 1; i >= 0; i--) {
			ans.append(tmpAns[i]);
		}
		return ans.toString();
	}

	public static void main(String[] args) {
	}
	

}
