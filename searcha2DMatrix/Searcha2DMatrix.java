package com.mirraico.leetcode;

public class Searcha2DMatrix {
	
	public boolean searchMatrix(int[][] matrix, int target) {
		int m = matrix.length;
		if(m == 0) return false;
		int n = matrix[0].length;
		if(n == 0) return false;
		int l = 0, r = m, mid;
		while(r - l > 1) {
			mid = (l + r) / 2;
			if(matrix[mid][0] == target) return true;
			else if(matrix[mid][0] < target) l = mid;
			else r = mid;
		}
		int row = l;
		l = 0; r = n;
		while(r - l > 1) {
			mid = (l + r) / 2;
			if(matrix[row][mid] == target) return true;
			else if(matrix[row][mid] < target) l = mid;
			else r = mid;
		}
		if(matrix[row][l] == target) return true;
		else return false;
	}

	public static void main(String[] args) {
		int[][] nums = {{1, 3}};
		System.out.println(new Solution().searchMatrix(nums, 1));
	}
	
}
