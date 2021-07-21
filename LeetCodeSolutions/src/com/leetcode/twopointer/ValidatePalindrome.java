package com.leetcode.twopointer;

public class ValidatePalindrome {

	public static void main(String[] args) {

	}

	public boolean isPalindrome(String s) {

		int p1 = 0;
		int p2 = s.length();

		while (p1 <= p2) {
			if (isNotLetterOrDigit(s, p1)) {
				p1++;
			} else if (isNotLetterOrDigit(s, p2)) {
				p2--;
			} else {
				if (toLowerCase(s, p1) != toLowerCase(s, p2)) {
					return false;
				}
				p1++;
				p2--;
			}
		}
		return true;
	}

	private boolean isNotLetterOrDigit(String s, int input) {
		return !Character.isLetterOrDigit(s.charAt(input));
	}

	private char toLowerCase(String s, int input) {
		return Character.toLowerCase(s.charAt(input));
	}
}
