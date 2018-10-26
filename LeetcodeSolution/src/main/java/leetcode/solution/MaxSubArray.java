package main.java.leetcode.solution;

public class MaxSubArray {

	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray(nums));
	}

	static int maxSubArray(int[] nums) {
		int l = nums.length;
		int[] dp = new int[l];
		dp[0] = nums[0];
		int max = dp[0];
		for (int i = 1; i < l; i++) {
			dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
			max = Math.max(dp[i], max);
		}
		return max;
	}

}
