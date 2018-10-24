package main.java.leetcode.solution;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "A man, a plan, a canal: Panama";
		System.out.println(reverseString(s));
	}
	
	static String reverseString(String s) {
		int left = 0, right = s.length() -1;
		char[] sArr = s.toCharArray();
		while(left<right) {
			swap(sArr, left++, right--);
		}
		return String.valueOf(sArr);
	}
	
	static void swap(char[] sArr, int left, int right) {
		char temp = sArr[left];
		sArr[left] = sArr[right];
		sArr[right] = temp;
	}

}
