package main.java.leetcode.solution;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,0,1};
		Arrays.sort(nums);
		System.out.println(missingNumber(nums));
	}
	
	static int missingNumber(int[] nums) {
		int left = 0, right = nums.length -1, midNum = (right + left)/2;
		while(left<right) {
			int mid = left + (right - left)/2;
			System.out.println("Mid:"+mid+","+"MidNum:"+midNum);
			if(nums[mid] > midNum) {
				right = mid;
			}else {
				left = mid+1;
			}
		}
		return left;
	}
}
