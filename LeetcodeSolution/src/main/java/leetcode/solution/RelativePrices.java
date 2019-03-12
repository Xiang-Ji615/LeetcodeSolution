package main.java.leetcode.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class RelativePrices {

	public static void main(String[] args) {
//		int[] nums = { 10, 3, 8, 9, 4 };
//		System.out.println(Arrays.toString(findRelativeRanks(nums)));
		
	}

	public static String[] findRelativeRanks(int[] nums) {
		int l = nums.length;
		int[][] sort = new int[l][2];
		for (int i = 0; i < l; i++) {
			sort[i][0] = nums[i];
			sort[i][1] = i;
		}

		Arrays.sort(sort, (a, b) -> (b[0] - a[0]));
		String[] res = new String[l];
		for (int i = 0; i < l; i++) {
			if (i == 0)
				res[sort[i][1]] = "Gold Medal";
			else if (i == 1)
				res[sort[i][1]] = "Silver Medal";
			else if (sort[i][1] == 2)
				res[sort[i][1]] = "Bronze Medal";
			else
				res[sort[i][1]] = i + 1 + "";
		}
		return res;
	}

	static List<List<Integer>> optimalUtilization(int maxTravelDist, List<List<Integer>> forwardRouteList,
			List<List<Integer>> returnRouteList) {
		int fl = forwardRouteList.size();
		int rl = returnRouteList.size();
		int[][] dp = new int[fl][rl];
		int dif = Integer.MAX_VALUE;
		;
		for (int i = 0; i < fl; i++) {
			for (int j = 0; j < rl; j++) {
				dp[i][j] = forwardRouteList.get(i).get(1) + returnRouteList.get(i).get(1);
				dif = Math.min(dif, maxTravelDist - dp[i][j]);
			}
		}
		List<List<Integer>> res = new ArrayList<>();
		for (int i = 0; i < fl; i++) {
			for (int j = 0; j < rl; j++) {
				if (maxTravelDist - dp[i][j] == dif) {
					List<Integer> resEle = new ArrayList<>();
					resEle.add(i + 1);
					resEle.add(j + 1);
					res.add(resEle);
				}
			}
		}
		return res;
	}

}
