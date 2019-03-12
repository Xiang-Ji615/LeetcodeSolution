package main.java.leetcode.solution;

import java.util.Arrays;

public class LongestPalindromeSubSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "cbbd";
		System.out.println(longestPalindromeSubseq(s));
	}

	public static int longestPalindromeSubseq(String s) {
		int l = s.length();
		int res = Integer.MIN_VALUE;
		int[][] dp = new int[l][l];
		for (int i = 0; i < l; i++) {
			dp[i][i] = 1;
			for (int j = 0; j < i; j++) {
				if (s.charAt(i) == s.charAt(j))
					dp[j][i] = dp[j + 1][i - 1] + 2;
				else
					dp[j][i] = Math.max(dp[j + 1][i], dp[j][i - 1]);
				res = Math.max(dp[j][i], res);
			}
		}
		return res;
	}
	
	static void printDp(int[][] dp) {
		for(int[] ele : dp) {
			System.out.println(Arrays.toString(ele));
		}
	}

}
