package main.java.leetcode.solution;

public class MaxCutRod {

	public static void main(String[] args) {
		int[] rods = {1, 5, 8, 9, 10, 17, 17, 20}; 
		System.out.println("Max amount with cut is "+ getMaxFromRods(rods));
	}

	private static Integer getMaxFromRods(int[] rods) {
		int l = rods.length;
		int[] dp = new int[l+1];
		dp[0] = 0;
		for(int i=1;i<=l;i++) {
			int curMax = Integer.MIN_VALUE;
			for(int j=0;j<i;j++) {
				curMax = Math.max(curMax, dp[i-j-1] + rods[j]);
			}
			dp[i] = curMax;
		}
		return dp[l];
	}

}
