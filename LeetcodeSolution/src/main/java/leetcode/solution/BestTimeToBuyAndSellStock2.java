package main.java.leetcode.solution;

public class BestTimeToBuyAndSellStock2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));
	}

	 static int maxProfit(int[] prices) {
		 int max = 0;
		 for(int i=1; i<prices.length;i++) {
			 max += Math.max(0,  prices[i] - prices[i-1]);
		 }
		 return max;
	 }
}
