package main.java.leetcode.solution;

import java.util.Arrays;

public class FirstUniqueChar {

	public static void main(String[] args) {
		String s = "loveleetcode";
		System.out.println(firstUniqChar(s));
	}
	
	static int firstUniqChar(String s) {
		int[] count = new int[26];
		char[] sCha = s.toCharArray();
		for(int i=0; i<sCha.length;i++) {
			count[sCha[i] - 'a']++;
		}
		System.out.println(Arrays.toString(count));
		for(int i=0; i<sCha.length;i++) {
			if(count[sCha[i] - 'a'] == 1) {
				return i;
			}
		}
		return -1;
	}

}
