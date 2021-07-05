package com.leetcode.validparantheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		System.out.println(isValidParentheses("[[]]}"));
	}

	public static boolean isValidParentheses(String s) {
		Map<Character, Character> map = new HashMap<>() {
			{
				put(')', '(');
				put(']', '[');
				put('}', '{');
			}
		};

		if (s.isEmpty()) {
			return true;
		}
		Stack<Character> stack = new Stack<>();
		int n = s.length();
		for (int index = 0; index < n; index++) {
			char c = s.charAt(index);
			if (map.containsKey(c)) {
				char topElement = stack.isEmpty() ? '#' : stack.pop();
				if (topElement != map.get(c)) {
					return false;
				}
			} else {
				stack.push(c);
			}
		}

		return stack.isEmpty();
	}
}
