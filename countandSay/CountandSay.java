package com.mirraico.leetcode;

public class CountandSay {
	
	public String count(String str) {
		StringBuilder sb = new StringBuilder();
		char ch = str.charAt(0); int cnt = 1;
		for(int i = 1; i < str.length(); i++) {
			if(str.charAt(i) == ch) cnt++;
			else {
				sb.append("" + cnt + ch);
				ch = str.charAt(i);
				cnt = 1;
			}
		}
		sb.append("" + cnt + ch);
		return sb.toString();
	}
	
	public String countAndSay(int n) {
		String ans = "1";
		for(int i = 1; i < n; i++) {
			ans = this.count(ans);
		}
		return ans;
	}

	public static void main(String[] args) {
		System.out.println(new Solution().countAndSay(3));
	}

}
