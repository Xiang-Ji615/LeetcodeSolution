package main.java.leetcode.solution;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		String s = "()[]{}";
		System.out.println(isValid(s));
	}

	static boolean isValid(String s) {
		Map<Character, Character> map = new HashMap<>();
		map.put('}', '{');
		map.put(')', '(');
		map.put(']', '[');
		
		Stack<Character> stack = new Stack<>();
		char[] cArr = s.toCharArray();
		for(int i=0; i<cArr.length;i++) {
			if(map.containsKey(cArr[i])){
				if(stack.pop() != map.get(cArr[i])) {
					return false;
				}
			}else {
				stack.push(cArr[i]);
			}
		}
		if(!stack.isEmpty())
			return false;
		return true;
	}

}
