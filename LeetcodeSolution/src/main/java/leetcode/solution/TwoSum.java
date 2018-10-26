package main.java.leetcode.solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = { 3,2,4 };
		int target = 6;
		System.out.println(Arrays.toString(twoSum(nums, target)));
	}

	static int[] twoSum(int[] nums, int target) {
		int l = nums.length;
		Map<Integer, Integer> positionCache = new HashMap<>();
		int[] res = new int[2];
		for(int i=0;i<l;i++) {
			if(positionCache.containsKey(target - nums[i])) {
				res[0] = positionCache.get(target - nums[i]);
				res[1] = i;
				break;
			}
			positionCache.put(nums[i], i);
			
		}
		return res;
	}

}
