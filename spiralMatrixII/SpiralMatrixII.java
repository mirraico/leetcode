package com.mirraico.leetcode;

public class SpiralMatrixII {
	
	public int[][] generateMatrix(int n) {
		int[][] matrix = new int[n][n];
		if(n == 0) return matrix;
		int i = 0, j = 0, lev = 0, dir = 0, cnt = 1;
		int num = n * n;
		while(num > 1) {
			switch(dir) {
			case 0:
				while(j < n - 1 - lev) {
					matrix[i][j] = cnt++;
					j++; num--;
				}
				dir++;
				break;
			case 1:
				while(i < n - 1 - lev) {
					matrix[i][j] = cnt++;
					i++; num--;
				}
				dir++;
				break;
			case 2:
				while(j > lev) {
					matrix[i][j] = cnt++;
					j--; num--;
				}
				dir++; lev++;
				break;
			case 3:
				while(i > lev) {
					matrix[i][j] = cnt++;
					i--; num--;
				}
				dir = 0;
				break;
			}
		}
		matrix[i][j] = cnt++;
		return matrix;
	}

	public static void main(String[] args) {
	}

}
