package com.mirraico.leetcode;

import java.util.*;

public class ValidParentheses {
	
	public boolean isValid(String s) {
		List<Character> stack = new ArrayList<>();
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch == '(') {
				stack.add(')');
			} else if(ch == '[') {
				stack.add(']');
			} else if(ch == '{') {
				stack.add('}');
			} else {
				if(stack.isEmpty() || stack.remove(stack.size() - 1) != ch) return false;
			}
		}
		return stack.isEmpty() ? true : false;
	}
	
	public static void main(String[] args) {
	}

}
