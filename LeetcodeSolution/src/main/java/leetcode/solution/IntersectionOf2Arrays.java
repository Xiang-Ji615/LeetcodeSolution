package main.java.leetcode.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOf2Arrays {

	public static void main(String[] args) {
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		System.out.println(Arrays.toString(intersect(nums1, nums2)));
	}
	
	static int[] intersect(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int i=0, j=0;
		List<Integer> numsList = new ArrayList<>(); 
		while(i<nums1.length && j<nums2.length) {
			if(nums1[i] == nums2[j]) {
				numsList.add(nums1[i]);
				i++;
				j++;
			}else if(nums1[i] > nums2[j]) {
				j++;
			}else {
				i++;
			}
		}
		int[] res = new int[numsList.size()];
		for(int k=0;k<numsList.size();k++) {
			res[k] = numsList.get(k);
		}
		return res;
	}

}
