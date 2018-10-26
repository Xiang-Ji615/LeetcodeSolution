package main.java.leetcode.solution;

import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits = { 8,9,9,9 };
		System.out.println(Arrays.toString(plusOne(digits)));
	}

	static int[] plusOne(int[] digits) {
		int cur = digits.length - 1;
		return helper(digits, cur);
	}

	static int[] helper(int[] digits, int cur) {
		if (cur < 0) {
			digits = new int[digits.length + 1];
			digits[0] = 1;
			return digits;
		} else if (digits[cur] == 9) {
			digits[cur] = 0;
			return helper(digits, cur - 1);
		} else {
			digits[cur] += 1;
			return digits;
		}
	}

}
