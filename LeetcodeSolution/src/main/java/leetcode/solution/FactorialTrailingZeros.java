package main.java.leetcode.solution;

public class FactorialTrailingZeros {

	public static void main(String[] args) {
		int n = 15;
		System.out.println(trailingZeroes(n));
	}
	
	static int trailingZeroes(int n) {
		int ret = 0;
		while(n>0) {
			n/=5;
			ret+=n;
		}
		return ret;
	}

}
