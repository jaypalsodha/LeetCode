package com.leetcode.twopointer;

import java.util.Stack;

public class SubSequence {

	public static void main(String[] args) {

	}

	public boolean isSubsequence(String s, String t) {
		int p1 = 0;
		int p2 = 0;

		while (p1 < s.length() && p2 < t.length()) {
			if (s.charAt(p1) == t.charAt(p2)) {
				p1++;
				p2++;
			} 
			else {
				p2++;
			}
		}
		return p1 == s.length();
	}

	public boolean isSubsequenceUsingCharMatch(String s, String t) {
		if (s.length() == 0) {
			return true;
		}

		int charPointer = 0;

		char[] sArray = s.toCharArray();
		char[] tArray = t.toCharArray();

		for (int i = 0; i < t.length(); i++) {
			if (tArray[i] == sArray[charPointer]) {
				charPointer++;
				if (charPointer == s.length()) {
					return true;
				}
			}
		}

		return charPointer == s.length();
	}

	public boolean isSubsequenceUsingStack(String s, String t) {

		if (s.isEmpty()) {
			return true;
		}

		Stack<Character> stack = new Stack<>();
		stack.push('#');
		for (int i = s.length() - 1; i >= 0; i++) {
			stack.push(s.charAt(i));
		}

		for (int i = 0; i < t.length(); i++) {
			if (stack.peek() == t.charAt(i)) {
				stack.pop();
			}
		}
		return stack.peek() == '@';
	}

	/*
	 * 
	 * 
	 * 392. Is Subsequence Easy
	 * 
	 * 2754
	 * 
	 * 249
	 * 
	 * Add to List
	 * 
	 * Share Given two strings s and t, return true if s is a subsequence of t, or
	 * false otherwise.
	 * 
	 * A subsequence of a string is a new string that is formed from the original
	 * string by deleting some (can be none) of the characters without disturbing
	 * the relative positions of the remaining characters. (i.e., "ace" is a
	 * subsequence of "abcde" while "aec" is not).
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: s = "abc", t = "ahbgdc" Output: true Example 2:
	 * 
	 * Input: s = "axc", t = "ahbgdc" Output: false
	 * 
	 * 
	 * Constraints:
	 * 
	 * 0 <= s.length <= 100 0 <= t.length <= 104 s and t consist only of lowercase
	 * English letters.
	 * 
	 * 
	 * Follow up: Suppose there are lots of incoming s, say s1, s2, ..., sk where k
	 * >= 109, and you want to check one by one to see if t has its subsequence. In
	 * this scenario, how would you change your code?
	 */
}
