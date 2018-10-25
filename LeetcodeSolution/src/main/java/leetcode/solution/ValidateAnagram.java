package main.java.leetcode.solution;

import java.util.Arrays;

public class ValidateAnagram {

	public static void main(String[] args) {
		String s = "anagram", t = "nagaram";
		System.out.println(isAnagram(s, t));
	}
	
	static boolean isAnagram(String s, String t) {
		char[] sArr = s.toCharArray();
		char[] tArr = t.toCharArray();
		
		Arrays.sort(sArr);
		Arrays.sort(tArr);
		
		for(int i=0;i<sArr.length;i++) {
			if(sArr[i] != tArr[i])
				return false;
		}
		return true;
	}

}
