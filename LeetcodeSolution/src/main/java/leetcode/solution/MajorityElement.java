package main.java.leetcode.solution;

import java.util.Arrays;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 2, 1, 1, 1, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 };
		System.out.println(majorityElement(nums));
	}

	static int majorityElement(int[] nums) {
		Arrays.sort(nums);
		int i = 0, j = nums.length - 1;
		return nums[i + (j - i) / 2];
	}

}
