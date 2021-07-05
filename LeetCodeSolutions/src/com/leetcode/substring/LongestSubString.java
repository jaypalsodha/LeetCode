package com.leetcode.substring;

import java.util.HashMap;
import java.util.Map;

public class LongestSubString {

	// longest substring
	// here will wil use hashmap
	// "abccadb"
	public static void main(String[] args) {
		System.out.println(longestSubStringWithoutRepeatingChar("abccadb"));
	}

	public static int longestSubStringWithoutRepeatingChar(String s) {

		int n = s.length();
		int ans = 0;
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0, j = 0; j < n; j++) {
			if (map.containsKey(s.charAt(j))) {
				i = Math.max(map.get(s.charAt(j)), i);
			}
			ans = Math.max(ans, j - i + 1);
			map.put(s.charAt(j), j + 1);
		}
		return ans;
	}
}
