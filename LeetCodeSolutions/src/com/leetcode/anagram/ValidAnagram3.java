package com.leetcode.anagram;

public class ValidAnagram3 {

	public static void main(String[] args) {
		System.out.println(isValidAnagram("aabcca", "ccbaaaa"));
	}

	public static boolean isValidAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}

		int[] array = new int[26];
		for (int i = 0; i < s.length(); i++) {
			array[s.charAt(i) - 'a']++;
		}
		for (int i = 0; i < s.length(); i++) {
			array[t.charAt(i) - 'a']--;
			if (array[t.charAt(i) - 'a'] < 0) {
				return false;
			}
		}
		return true;
	}
}
