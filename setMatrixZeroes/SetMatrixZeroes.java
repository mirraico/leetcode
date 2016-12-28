package com.mirraico.leetcode;

public class SetMatrixZeroes {
	
	public void setZeroes(int[][] matrix) {
		int m = matrix.length;
		if(m == 0) return;
		int n = matrix[0].length;
		if(n == 0) return;
		
		boolean f1 = false, f2 = false;
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(matrix[i][j] == 0) {
					matrix[i][0] = matrix[0][j] = 0;
					if(i == 0) f1 = true;
					if(j == 0) f2 = true;
				}
			}
		}
		for(int i = 1; i < m; i++) {
			if(matrix[i][0] == 0) {
				for(int j = 1; j < n; j++) {
					matrix[i][j] = 0;
				}
			}
		}
		for(int j = 1; j < n; j++) {
			if(matrix[0][j] == 0) {
				for(int i = 1; i < m; i++) {
					matrix[i][j] = 0;
				}
			}
		}
		if(f1) {
			for(int j = 0; j < n; j++) {
				matrix[0][j] = 0;
			}
		}
		if(f2) {
			for(int i = 0; i < m; i++) {
				matrix[i][0] = 0;
			}
		}
	}

	public static void main(String[] args) {
		int[][] matrix = {{1,0,2}};
		new Solution().setZeroes(matrix);
	}
	
}
