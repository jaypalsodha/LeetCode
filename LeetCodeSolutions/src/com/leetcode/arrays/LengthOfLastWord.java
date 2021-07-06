package com.leetcode.arrays;

public class LengthOfLastWord {

	public static int lengthOfLastWord(String s) {

		int count = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) != ' ') {
				count++;
			} else {
				if (count > 0) {
					return count;
				}
			}
		}

		return count;
	}
	/*
	 * 58. Length of Last Word Easy
	 * 
	 * 1210
	 * 
	 * 3332
	 * 
	 * Add to List
	 * 
	 * Share Given a string s consists of some words separated by spaces, return
	 * 
	 * the length of the last word in the string. If the last word does not
	 * 
	 * exist, return 0.
	 * 
	 * A word is a maximal substring consisting of non-space characters only.
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: s = "Hello World" Output: 5 Example 2:
	 * 
	 * Input: s = " " Output: 0
	 * 
	 * 
	 * Constraints:
	 * 
	 * 1 <= s.length <= 104 s consists of only English letters and spaces ' '.
	 */
}
