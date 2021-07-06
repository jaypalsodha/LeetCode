package com.leetcode.anagram;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram1 {
	
	/*
	 * Given a two strings s and t, write a function to determine
	 * if t is an anagram of s;
	 * 
	 * aabcc and ccbaa
	 */
	public static void main(String[] args) {
		System.out.println(isAnagram("aabcca", "ccbaaa"));
	}
	
	public static boolean isAnagram(String s, String t) {

		if(s.length() != t.length()) {
			return false;
		}
		Map<Character, Integer> mapS = new HashMap<>();
		Map<Character, Integer> mapT = new HashMap<>();
		
		for(int i =0; i < s.length(); i++) {
			mapS.put(s.charAt(i), mapS.getOrDefault(mapS.get(s.charAt(i)), 1)+1);
			mapT.put(t.charAt(i), mapT.getOrDefault(mapT.get(t.charAt(i)), 1)+1);
		}
		
		for(Map.Entry<Character, Integer> entry : mapS.entrySet()) {
			if(mapT.get(entry.getKey()) != entry.getValue()) {
				return false;
			}
		}
		return true;
	}
}
