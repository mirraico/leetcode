package com.mirraico.leetcode;

import java.util.*;

public class SpiralMatrix {
	
	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> ans = new ArrayList<>();
		int n = matrix.length;
		if(n == 0) return ans;
		int m = matrix[0].length;
		if(m == 0) return ans;
		int i = 0, j = 0, lev = 0, dir = 0;
		int num = n * m;
		while(num > 1) {
			switch(dir) {
			case 0:
				while(j < m - 1 - lev) {
					ans.add(matrix[i][j]);
					j++; num--;
				}
				dir++;
				break;
			case 1:
				while(i < n - 1 - lev) {
					ans.add(matrix[i][j]);
					i++; num--;
				}
				dir++;
				break;
			case 2:
				while(j > lev) {
					ans.add(matrix[i][j]);
					j--; num--;
				}
				dir++; lev++;
				break;
			case 3:
				while(i > lev) {
					ans.add(matrix[i][j]);
					i--; num--;
				}
				dir = 0;
				break;
			}
		}
		ans.add(matrix[i][j]);
		return ans;
	}

	public static void main(String[] args) {
		int nums[][] = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(new Solution().spiralOrder(nums));
	}

}
