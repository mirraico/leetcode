package com.mirraico.leetcode;

import java.util.*;

public class RestoreIPAddresses {
	
	public boolean judge(String str) {
		if(str.length() == 1) return true;
		if(str.charAt(0) == '0') return false;
		int tmp = new Integer(str);
		if(tmp <= 0 || tmp > 255) return false;
		return true;
	}
	
	public void dfs(String s, int pos, String[] sub, int lev, List<String> ans) {
		if(s.length() - pos > (4 - lev) * 3 || s.length() - pos < (4 - lev)) return;
		if(lev == 3) {
			String tmp = s.substring(pos);
			if(judge(tmp)) {
				ans.add(sub[0] + "." + sub[1] + "." + sub[2] + "." + tmp);
			}
			return;
		}
		
		for(int i = 1; i <= 3; i++) {
			if(pos + i > s.length()) return;
			String tmp = s.substring(pos, pos + i);
			if(!this.judge(tmp)) continue;
			sub[lev] = tmp;
			this.dfs(s, pos + i, sub, lev + 1, ans);
		}
	}
	
	public List<String> restoreIpAddresses(String s) {
		List<String> ans = new ArrayList<>();
		String[] sub = new String[3];
		this.dfs(s, 0, sub, 0, ans);
		return ans;
	}
	
	public static void main(String[] args) {
		new Solution().restoreIpAddresses("0000");
	}
}

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; next = null; }
}