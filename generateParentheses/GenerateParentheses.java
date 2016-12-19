package com.mirraico.leetcode;

import java.util.*;

public class GenerateParentheses {
	
	public void generate(List<String> ans, StringBuilder sb, int l, int r) {
		if(l == 0 && r == 0) {
			ans.add(sb.toString());
		}
		if(l > 0) {
			sb.append('(');
			this.generate(ans, sb, l - 1, r);
			sb.deleteCharAt(sb.length()-1);
		}
		if(r > l) {
			sb.append(')');
			this.generate(ans, sb, l, r - 1);
			sb.deleteCharAt(sb.length()-1);
		}
	}
	
	public List<String> generateParenthesis(int n) {
		List<String> ans = new ArrayList<>();
		StringBuilder tmpAns = new StringBuilder();
		this.generate(ans, tmpAns, n, n);
		return ans;
	}

	public static void main(String[] args) {
		System.out.println(new Solution().generateParenthesis(3));
	}

}


