package com.mirraico.leetcode;

public class WordSearch {
	
	public boolean dfs(char[][] board, boolean[][] used, int x, int y, String word, int pos) {
		if(pos == word.length()) return true;
		if(x < 0 || y < 0 || x == board.length || y == board[x].length) return false;
		if(used[x][y] || board[x][y] != word.charAt(pos)) return false;
		
		used[x][y] = true;
		if(this.dfs(board, used, x + 1, y, word, pos + 1)) return true;
		if(this.dfs(board, used, x, y + 1, word, pos + 1)) return true;
		if(this.dfs(board, used, x - 1, y, word, pos + 1)) return true;
		if(this.dfs(board, used, x, y - 1, word, pos + 1)) return true;
		used[x][y] = false;
		
		return false;
	}
	
	public boolean exist(char[][] board, String word) {
		if(word.length() == 0) return true;
		int m = board.length;
		if(m == 0) return false;
		int n = board[0].length;
		if(n == 0) return false;
		boolean[][] used = new boolean[m][n];
		for(int i = 0; i < m; i ++) {
			for(int j = 0; j < n; j++) {
				if(this.dfs(board, used, i, j, word, 0)) return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		char[][] board = {{'a', 'a'}, {'a', 'a'}};
		System.out.println(new Solution().exist(board, "aa"));
	}
}
