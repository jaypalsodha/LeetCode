package com.leetcode.arrays;

public class FindSecondHighest {

	public static void main(String[] args) {
		System.out.println(new FindSecondHighest().secondHighest(new int[] { 8, 9, 9 }));
	}

	public int secondHighest(int[] n) {

		if (n.length == 1) {
			return -1;
		}
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;

		for (int i = 0; i < n.length; i++) {
			if (highest < n[i]) {
				if(secondHighest != highest) {
					secondHighest = highest;
				}
				highest = n[i];
			} else if (secondHighest < n[i]) {
				secondHighest = n[i];
			}
		}

		return highest == secondHighest ? -1 : secondHighest;
	}
}
