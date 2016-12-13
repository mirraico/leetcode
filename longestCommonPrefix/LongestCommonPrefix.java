package com.mirraico.leetcode;

public class LongestCommonPrefix {

	public String longestCommonPrefix(String[] strs) {
		if(strs.length == 0) return "";
		if(strs.length == 1) return strs[0];
		int len = strs[0].length(); int pos = 0;
		for(int i = 1; i < strs.length; i++) {
			if(strs[i].length() < len) {
				len = strs[i].length();
				pos = i;
			}
		}
		for(int i = 0; i < len; i++) {
			char ch = strs[0].charAt(i);
			for(int j = 1; j < strs.length; j++) {
				if(ch != strs[j].charAt(i)) return strs[0].substring(0, i);
			}
		}
		return strs[pos];
	}
	
	public static void main(String[] args) {
		String[] input = new String[2];
		input[0] = ""; input[1] = "b";
		System.out.println(new Solution().longestCommonPrefix(input));
	}

}
