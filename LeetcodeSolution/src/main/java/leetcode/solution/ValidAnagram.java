package main.java.leetcode.solution;

import java.util.Arrays;

public class ValidAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "anagram", t = "nagaram";
		System.out.println(isAnagram(s, t));
	}
	
	static boolean isAnagram(String s, String t) {
		char[] sArr = s.toCharArray();
		char[] tArr = t.toCharArray();
		Arrays.sort(sArr);
		Arrays.sort(tArr);
		return String.valueOf(sArr).equals(String.valueOf(tArr));
	}
}
