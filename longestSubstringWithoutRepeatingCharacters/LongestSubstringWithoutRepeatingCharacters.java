package com.mirraico.leetcode;

public class LongestSubstringWithoutRepeatingCharacters {

	public int lengthOfLongestSubstring(String s) {
		int i = 0, j = 0, ans = 0;
		boolean flag[] = new boolean[256];
		while(j < s.length()) {
			if(!flag[s.charAt(j)]) {
				flag[s.charAt(j)] = true;
			} else {
				if(j - i > ans) ans = j - i;
				while(s.charAt(i) != s.charAt(j)) {
					flag[s.charAt(i)] = false;
					i++;
				}
				i++;
			}
			j++;
		}
		if(j - i > ans) ans = j - i;
        return ans;
    }
	
	public static void main(String[] args) {
		System.out.println(new Solution().lengthOfLongestSubstring("abcabcbb"));
	}

}
