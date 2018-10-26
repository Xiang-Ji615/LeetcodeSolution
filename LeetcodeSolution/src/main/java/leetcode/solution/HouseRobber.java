package main.java.leetcode.solution;

public class HouseRobber {

	public static void main(String[] args) {
		int[] nums = {2,7,9,3,1};
		System.out.println(rob(nums));
	}

	 static int rob(int[] nums) {
		 int l = nums.length;
		 int[] rob = new int[l];
		 int[] notRob = new int[l];
		 rob[0] = nums[0];
		 for(int i=1;i<l;i++) {
			 rob[i] = notRob[i-1] + nums[i];
			 notRob[i] = Math.max(rob[i-1], notRob[i-1]);
		 }
		 return Math.max(rob[l-1], notRob[l-1]);
	 }
}
