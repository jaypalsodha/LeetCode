package com.leetcode.dna;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DnaProblem {

	// Repeat DNA sequence,
	/*
	 * All the DNA composed of a series of nucleotides abbreviated as 'A', 'C', 'G',
	 * 'T' FOR EXAMPLE "ACCGGGTT" WHEN STUDYING DNA IT IS USEFUL TO IDENTIFY
	 * REPEATING SEQUENCE WRITE A FUNCTION THAT FINDS ALL THE 10 LETTER WORDS SUB
	 * STRING WHICH IS REPEATING MORE THAN ONCE
	 */
	public static void main(String[] args) {
		System.out.println(findRepeatedSequence("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
	}

	public static List<String> findRepeatedSequence(String s) {

		List<String> list = new ArrayList<>();
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i <= s.length() - 10; i++) {
			String substring = s.substring(i, i + 10);
			map.put(substring, map.getOrDefault(substring, 0)+1);
		}
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			
			if(entry.getValue() > 1) {
				list.add(entry.getKey());
			}
		}
		return list;
	}
}
