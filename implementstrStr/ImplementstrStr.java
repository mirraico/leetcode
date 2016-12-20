package com.mirraico.leetcode;

public class ImplementstrStr {
	
	public int strStr(String haystack, String needle) {
		
		int hLen = haystack.length(), nLen = needle.length();
		if(nLen == 0) return 0;
		int[] next = new int[nLen];
		next[0] = -1;
		int j = 0, k = -1;
		while(j < nLen - 1) {
			if(k == -1 || needle.charAt(j) == needle.charAt(k)) {
				j++; k++;
				next[j] = k;
				/* 优化
				if(needle.charAt(j) != needle.charAt(k)) {
					next[j] = k;
				} else {
					next[j] = next[k];
				}
				*/
			} else {
				k = next[k];
			}
		}
		int i = 0; j = 0;
		while(i < hLen && j < nLen) {
			if(j == -1 || haystack.charAt(i) == needle.charAt(j)) {
				i++; j++;
			} else {
				j = next[j];
			}
		}
		if(j == nLen) return i - j;
		else return -1;
	}

	public static void main(String[] args) {
		System.out.println(new Solution().strStr("BBABCDABCABCDABCDABDE", "ABCDABD"));
	}

}
