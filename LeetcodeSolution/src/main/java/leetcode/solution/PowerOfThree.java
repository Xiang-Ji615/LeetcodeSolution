package main.java.leetcode.solution;

public class PowerOfThree {

	public static void main(String[] args) {
		System.out.println(isPowerOfThree(27));
	}
	
	static boolean isPowerOfThree(int n) {
		if(n == 0)
			return false;
		else if(n == 1)
			return true;
		else if(n%3 == 0) {
			return isPowerOfThree(n/3);
		}else {
			return false;
		}
	}

}
