package main.java.leetcode.solution;

public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		int[] prices = { 7, 1, 5, 3, 6, 4 };
		System.out.println(maxProfit(prices));
	}
	
	static int maxProfit(int[] prices) {
		int l = prices.length;
		int[] dp = new int[l];
		int max = 0;
		for(int i=1;i<l;i++) {
			dp[i] = Math.max(0, dp[i-1]+prices[i]-prices[i-1]);
			max = Math.max(dp[i], max);
		}
		return max;
		
	}

}
