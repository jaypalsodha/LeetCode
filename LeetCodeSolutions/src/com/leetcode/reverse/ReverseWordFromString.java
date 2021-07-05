package com.leetcode.reverse;

import java.util.stream.IntStream;

public class ReverseWordFromString {

	// we will use two pointers, i and j,
	// once we encounter empty string we will initialize our pointer j to i
	// we will also initialize StrinBuilder
	// if stringbuilder is empty we not add any empty space,
	// if stringbuilder is field with value we will add space to it

	// "jaypal sodha" = "sodha jaypal"

	public static void main(String[] args) {
		System.out.println(reverseWordFromString("jaypal sodha"));
	}

	public static String reverseWordFromString(String str) {

		int i = str.length()-1;
		int j;
		StringBuilder sb = new StringBuilder();

		while (i >= 0) {

			if (str.charAt(i) == ' ') {
				i--;
			} else {
				j = i;

				while (i >= 0 && str.charAt(i) != ' ') {
					i--;
				}
				if (!sb.isEmpty()) {
					sb.append(" ");
				}
				for (int k = i + 1; k <= j; k++) {
                    sb.append(str.charAt(k));
                }
			}
		}

		return sb.toString();
	}
}
