package main.java.leetcode.solution;

import java.util.Arrays;

public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,1,3,3,4,3,2,4,2};
		System.out.println(containsDuplicate(nums));
	}
	
	static boolean containsDuplicate(int[] nums) {
		Arrays.sort(nums);
		int l = nums.length;
		if(l==0)
			return false;
		int pre = nums[0];
		for(int i=1;i<l;i++) {
			if(pre == nums[i])
				return true;
			pre = nums[i];
		}
		return false;
	}

}
