package com.mirraico.leetcode;

public class LengthofLastWord {
	
	public int lengthOfLastWord(String s) {
		int ed = -1;
		for(int i = s.length() - 1; i >= 0; i--) {
			if(s.charAt(i) != ' ') {
				if(ed == -1) ed = i;
			} else {
				if(ed != -1) return ed - i;
			}
		}
		return ed == -1 ? 0 : ed + 1;
	}

	public static void main(String[] args) {
		System.out.println(new Solution().lengthOfLastWord("c"));
	}

}
