package main.java.challenge.solution;
import java.util.Arrays;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		String s1 = "AGGTAB", s2 ="GXTXAYB";
		int[][] dp  = new int[s1.length() + 1][s2.length() + 1];
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[0].length;j++) {
				if(i == 0 || j == 0)
					dp[i][j] = 0;
				else if(s1.charAt(i-1) == s2.charAt(j-1))
					dp[i][j] = dp[i-1][j-1] + 1;
				else
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
			}
		}
		
		System.out.println(dp[dp.length-1][dp[0].length-1]);
		
		for(int[] ele : dp)
			System.out.println(Arrays.toString(ele));
		
		int max = 0;
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[0].length;j++) {
				max = Math.max(max, dp[i][j]);
			}
		}
		
		int i = dp.length -1, j=dp[0].length - 1;
		StringBuilder sb = new StringBuilder();
		while(i!=0&&j!=0) {
			if(s1.charAt(i-1) == s2.charAt(j-1)) {
				sb.append(s1.charAt(i-1));
				i--;
				j--;
			}else {
				if(dp[i][j-1] > dp[i-1][j])
					j--;
				else
					i--;
			}
		}
		
		System.out.println(sb.reverse());

	}
}
