package main.java.leetcode.solution;

public class CountAndSay {

	public static void main(String[] args) {
		int n = 100;
		System.out.println(CountAndSay(n));
	}

	static char[] CountAndSay(int n) {
		String s = "1";
		for(int i=1; i<n; i++) {
			s = helper(s);
		}
		return s.toCharArray();
	}

	static String helper(String s) {
		StringBuilder sb = new StringBuilder();
		char[] cArr = s.toCharArray();
		char c = cArr[0];
		int count = 1;
		for(int i=0; i<cArr.length;i++) {
			if(cArr[i] == c) {
				count++;
			}else {
				sb.append(count);
				sb.append(c);
				c = cArr[i];
				count = 1;
			}
		}
		sb.append(count);
		sb.append(c);
		return sb.toString();
	}
	
	

}
