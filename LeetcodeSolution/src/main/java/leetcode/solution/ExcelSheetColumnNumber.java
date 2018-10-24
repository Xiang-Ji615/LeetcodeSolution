package main.java.leetcode.solution;

public class ExcelSheetColumnNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ZY";
		System.out.println(titleToNumber(s));
	}

	static int titleToNumber(String s) {
		char[] cArr = s.toCharArray();
		int res = 0;
		for(char c : cArr) {
			res = res*26+(c-'A'+1);
		}
		return res;
	}

}
