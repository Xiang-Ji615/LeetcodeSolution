package main.java.leetcode.solution;

import java.util.Arrays;

public class LongestCommonSequence {

	public static void main(String[] args) {
		String a = "head123h";
		String b = "tead2h2";
		System.out.println(helper(a, b));
	}
	
	static int helper(String a, String b) {
		char[] aArr = a.toCharArray();
		char[] bArr = b.toCharArray();
		int[][] dp = new int[aArr.length+1][bArr.length+1];
		String[][] track = new String[aArr.length+1][bArr.length+1];
		for(String[] ele : track)
			Arrays.fill(ele, "");
		for(int i=1;i<=aArr.length;i++) {
			for(int j=1;j<=bArr.length;j++) {
				if(aArr[i-1] == bArr[j-1]) {
					dp[i][j] = dp[i-1][j-1] + 1;
					track[i][j] = track[i-1][j-1] + aArr[i-1]; 
				}else {
					if(dp[i-1][j] > dp[i][j-1])
						track[i][j] = track[i-1][j];
					else
						track[i][j] = track[i][j-1];
				}
			}
		}
		System.out.println(track[aArr.length][bArr.length]);
		return dp[aArr.length][bArr.length];
	}

	static void printDp(int[][] dp) {
		for(int[] ele : dp)
			System.out.println(Arrays.toString(ele));
	}
	
	static void printTrack(String[][] track) {
		for(String[] ele : track)
			System.out.println(Arrays.toString(ele));
	}
}
