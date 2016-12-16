package com.mirraico.leetcode;

import java.util.*;

public class LetterCombinationsofaPhoneNumber {
	
	String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	
	public List<String> letterCombinations(String digits) {
		List<String> ans = new ArrayList<>();
		if(digits.length() == 0) return ans;
		StringBuilder tmpAns = new StringBuilder();
		this.dfs(ans, tmpAns, digits, 0);
		return ans;
	}
	
	public void dfs(List<String> ans, StringBuilder tmpAns, String digits, int level) {
		if(level == digits.length()) {
			ans.add(tmpAns.toString());
			return;
		}
		String levelMap = this.map[digits.charAt(level) - '0'];
		for(int i = 0; i < levelMap.length(); i++) {
			tmpAns.append(levelMap.charAt(i));
			this.dfs(ans, tmpAns, digits, level + 1);
			tmpAns.deleteCharAt(tmpAns.length() - 1);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(new Solution().letterCombinations("2"));
	}

}
