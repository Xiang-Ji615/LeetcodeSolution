package main.java.challenge.solution;

import java.util.Arrays;

public class KnapSack {

	public static void main(String[] args) {
		int[] weight = {10,20,30};
		int[] value = {60,100,120};
		int W = 50;
		
		int[][] dp = new int[weight.length+1][W+1];
		for(int i=1;i<dp.length;i++) {
			for(int j=0;j<dp[0].length;j++) {
				if(j < weight[i-1])
					dp[i][j] = dp[i-1][j];
				else
					dp[i][j] = Math.max(dp[i-1][j-weight[i-1]] + value[i-1], dp[i-1][j]);
			}
		}
		for(int[] ele : dp)
			System.out.println(Arrays.toString(ele));
		System.out.println(dp[weight.length][W]);
		
		System.out.println(dfs(weight, value, W, weight.length - 1));
		System.out.println(dfsTopToBottom(weight, value, W, 0));
	}
	
	//Dfs
	static int dfs(int[] weight, int[] value, int W, int cur) {
		if(cur < 0)
			return 0;
		else if(weight[cur] > W)
			return dfs(weight, value, W, cur-1);
		int include = value[cur] + dfs(weight,value, W-weight[cur], cur-1);
		int noInclude = dfs(weight,value, W, cur-1);
		int res = Math.max(include, noInclude);
		return res;
	}
	
	//Dfs top to bottom
	static int dfsTopToBottom(int[] weight, int[] value, int W, int cur) {
			if(W < 0 || cur >= weight.length)
				return 0;
			if(weight[cur] > W)
				return dfsTopToBottom(weight, value, W, cur+1);
			int curVal = value[cur];
			int curWeight = weight[cur];
			int include = curVal + dfsTopToBottom(weight,value, W-curWeight, cur+1);
//			System.out.println("Include : "+include);
			int noInclude = dfsTopToBottom(weight,value, W, cur+1);
			int res = Math.max(include, noInclude);
			return res;
		}

}
