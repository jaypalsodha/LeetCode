package com.leetcode.anagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

	public static void main(String[] args) {
		new GroupAnagram().groupAnagrams(new String[] { "eat", "tea", "tan", "ate", "nat", "bat" });
	}

	public List<List<String>> groupAnagrams(String[] strs) {

		if (strs.length == 0)
			return new ArrayList<>();
		Map<String, List<String>> map = new LinkedHashMap<>();
		for (String s : strs) {
			char[] charArray = s.toCharArray();
			Arrays.sort(charArray);
			List<String> orDefault = map.getOrDefault(Arrays.toString(charArray), new ArrayList<String>());
			orDefault.add(s);
			map.put(Arrays.toString(charArray), orDefault);
		}
		return new ArrayList<>(map.values());
	}
}
