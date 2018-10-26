package main.java.leetcode.solution;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

	public static void main(String[] args) {
		int num = 81;
		System.out.println(isHappy(19));

	}

	static boolean isHappy(int n) {
		Set<Integer> cacheSet = new HashSet<>();
		int sumCache, remain;
		while(cacheSet.add(n)) {
			sumCache  = 0;
			while(n>0) {
				remain = n%10;
				sumCache += remain*remain;
				n/=10;
			}if(sumCache == 1) {
				return true;
			}else {
				n=sumCache;
			}
		}
		return false;
	}

}
