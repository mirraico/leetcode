package com.mirraico.leetcode;

public class MergeIntervals {
	
	class Interval {

        int start;
        int end;
    }
    
    public int[][] merge(int[][] intervals) {
        List<Interval> res = new ArrayList<>();
        List<Interval> intervalList = new ArrayList<>();
        for (int[] interval : intervals) {

            Interval i = new Interval();
            i.start = interval[0];
            i.end = interval[1];

            intervalList.add(i);
        }

        intervalList.sort((i1,i2) -> i1.start - i2.start);
        if (intervalList.isEmpty()) {
            return new int[0][2];
        }
        res.add(intervalList.get(0));
        for (int i = 1; i < intervalList.size(); i++) {

            Interval old = res.get(res.size()-1);
            Interval now = intervalList.get(i);

            if (now.start <= old.end) {
                old.end = now.end > old.end ? now.end : old.end;
            } else {
                res.add(now);
            }
        }
        
        int[][] merge = new int[res.size()][2];
        for (int i = 0; i < res.size(); i++) {
            merge[i][0] = res.get(i).start;
            merge[i][1] = res.get(i).end;
        }
        
        return merge;
    }
	
	public static void main(String[] args) {
	}
}
