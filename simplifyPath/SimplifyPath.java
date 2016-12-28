package com.mirraico.leetcode;

import java.util.*;

public class SimplifyPath {
	
	public String simplifyPath(String path) {
		List<String> tmpAns = new ArrayList<>();
		String[] names = path.split("/");
		for(String name : names) {
			if(name.equals("") || name.equals(".")) continue;
			else if(name.equals("..")) {
				if(!tmpAns.isEmpty()) tmpAns.remove(tmpAns.size() - 1);
			}
			else tmpAns.add(name);
		}
		StringBuilder ans = new StringBuilder();
		for(int i = 0; i < tmpAns.size(); i++) {
			ans.append("/" + tmpAns.get(i));
		}
		if(ans.length() == 0) return "/";
		else return ans.toString();
	}

	public static void main(String[] args) {
		System.out.println(new Solution().simplifyPath("/a/./b/../../c/"));
	}
	
}
