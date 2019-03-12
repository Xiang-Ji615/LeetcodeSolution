package main.java.leetcode.solution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PhoneNumberCombo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(letterCombinations("23"));
	}
	
	public static List<String> letterCombinations(String digits) {
		Queue<String> ans = new LinkedList<String>();
		if(digits.isEmpty()) return new ArrayList<>(ans);
		String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		ans.add("");
		while(ans.peek().length()!=digits.length()){
//			System.out.println(ans);
			String remove = ans.poll();
			String map = mapping[digits.charAt(remove.length())-'0'];
			for(char c: map.toCharArray()){
				ans.offer(remove+c);
			}
		}
		return new ArrayList<>(ans);
	}

}
