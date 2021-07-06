package com.leetcode.anagram;

public class ValidAnagram2 {

	// solve the same problem using int array of 26
	// we store each of the character count in 0 to 25 index,
	// from the s we increase the character count, and from t
	// we decrease the character count, and at the end we check
	// whether all the characters are zero or not
	public static void main(String[] args) {
		System.out.println(isValidAnagram("aabcca", "ccbaaaa"));
	}

	public static boolean isValidAnagram(String s, String t) {

		if (s.length() != t.length()) {
			return false;
		}
		int[] arr = new int[26];
		for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i) - 'a']++;
			arr[t.charAt(i) - 'a']--;
		}
		for (int count = 0; count < s.length(); count++) {
			if (arr[count] != 0) {
				return false;
			}
		}

		return true;
	}
}
