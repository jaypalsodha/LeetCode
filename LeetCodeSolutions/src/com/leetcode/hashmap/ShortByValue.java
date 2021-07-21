package com.leetcode.hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ShortByValue {

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		// enter data into hashmap
		hm.put("Math", 98);
		hm.put("Data Structure", 85);
		hm.put("Database", 91);
		hm.put("Java", 95);
		hm.put("Operating System", 79);
		hm.put("Networking", 80);
		Map<String, Integer> hm1 = sortByValue(hm);

		// print the sorted hashmap
		for (Map.Entry<String, Integer> en : hm1.entrySet()) {
			System.out.println("Key = " + en.getKey() + ", Value = " + en.getValue());
		}
	}

	private static Map<String, Integer> sortByValue(HashMap<String, Integer> hm) {

		LinkedHashMap<String, Integer> collect = hm.entrySet().stream().sorted((i1, i2) -> i1.getValue().compareTo(i2.getValue()))
				.collect(Collectors
				.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		return null;
	}
}
