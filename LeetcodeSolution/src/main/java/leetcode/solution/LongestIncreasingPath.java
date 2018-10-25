package main.java.leetcode.solution;

public class LongestIncreasingPath {

	public static void main(String[] args) {
		int[][] matrix = { { 9, 9, 4 }, { 6, 6, 8 }, { 2, 1, 1 } };
		System.out.println(longestIncreasingPath(matrix));
	}

	static int longestIncreasingPath(int[][] matrix) {
		int row = matrix.length, col = matrix[0].length;
		int[][] memo = new int[row][col];
		int max = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				max = Math.max(max, dfs(matrix, i, j, Integer.MIN_VALUE, memo));
			}
		}
		return max;
	}

	static int dfs(int[][] matrix, int i, int j, int prev, int[][] memo) {
		int row = matrix.length, col = matrix[0].length;
		if (i < 0 || i >= row || j < 0 || j >= col) {
			return 0;
		} else if (matrix[i][j] <= prev) {
			return 0;
		} else if (memo[i][j] != 0) {
			return memo[i][j];
		} else {
			int curVal = matrix[i][j];
			int up = 1 + dfs(matrix, i, j + 1, curVal, memo);
			int down = 1 + dfs(matrix, i, j - 1, curVal, memo);
			int left = 1 + dfs(matrix, i - 1, j, curVal, memo);
			int right = 1 + dfs(matrix, i + 1, j, curVal, memo);
			int max = Math.max(Math.max(up, down), Math.max(left, right));
			memo[i][j] = max;
			return memo[i][j];
		}
	}

}
