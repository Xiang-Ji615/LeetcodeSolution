package main.java.leetcode.solution;

import java.util.Arrays;

public class MoveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 0, 1, 0, 3, 12 };
		moveZeros(nums);
		System.out.println(Arrays.toString(nums));
	}
	
	static void moveZeros(int[] nums) {
		int l = nums.length, j=0;
		for(int i=1;i<l;i++) {
			if(nums[i] != 0) {
				nums[j++] = nums[i];
			}
		}
		for(int i=j;i<l;i++) {
			nums[i] = 0;
		}
	}

}
