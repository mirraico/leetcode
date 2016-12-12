package com.mirraico.leetcode;

public class ZigZagConversion {

	public String convert(String s, int numRows) {
		if(numRows == 1) return s;
		
		StringBuilder[] sbs = new StringBuilder[numRows];
		boolean add = true; int p = 0;
		for(int i = 0; i < numRows; i++) {
			sbs[i] = new StringBuilder();
		}
		for(int i = 0; i < s.length(); i++) {
			if(p == numRows - 1) add = false;
			if(p == 0) add = true;
			sbs[p].append(s.charAt(i));
			p = add ? p+1 : p-1;
		}
		StringBuilder ans = new StringBuilder();
		for(int i = 0; i < numRows; i++) {
			ans.append(sbs[i]);
		}
        return ans.toString();
    }
	
	public static void main(String[] args) {
		System.out.println(new Solution().convert("AB", 1));
	}

}
