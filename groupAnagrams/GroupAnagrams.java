package com.mirraico.leetcode;

import java.util.*;

public class GroupAnagrams {
	
	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> ans = new ArrayList<>();
		Map<String, List<String>> map = new HashMap<>();
		for(String str : strs) {
			char[] tmp = str.toCharArray();
			Arrays.sort(tmp);
			String key = new String(tmp);
			List<String> tmpAns = map.get(key);
			if(tmpAns == null) tmpAns = new ArrayList<>();
			tmpAns.add(str);
			map.put(key, tmpAns);
		}
		Iterator<Map.Entry<String, List<String>>> it = map.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String, List<String>> entry = it.next();
			List<String> tmpAns = entry.getValue();
			Collections.sort(tmpAns);
			ans.add(tmpAns);
		}
		return ans;
	}

	public static void main(String[] args) {
	}

}
