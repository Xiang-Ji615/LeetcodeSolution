package main.java.leetcode.common.util;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getGCD(15,  10));
	}
	
	public static int getGCD(int a, int b) {
		if(a == 0 || b == 0) return a+b;
		return getGCD(b, a%b);
	}
	
	public int GCD(int a, int b) {
		if(a == 0 || b == 0) return a+b;
		return getGCD(b, a%b);
	}

	
}
