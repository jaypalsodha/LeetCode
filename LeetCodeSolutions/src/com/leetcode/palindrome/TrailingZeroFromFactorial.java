package com.leetcode.palindrome;

public class TrailingZeroFromFactorial {

	// find trailing zero from factorial
	// i.e 5! = 120 is having one training zero.
	// trailing zero can be found by identifying number of multiple of 5
	// 1 * 2 * 3 * 4 * 5 here 2 * 5 is one time, so the trailing zero would be one

	public static void main(String[] args) {
		System.out.println(findTrailingZero(25));
	}

	public static int findTrailingZero(int n) {

		int count = 0;
		while (n > 0) {
			n = n / 5;
			count = count + n;
		}
		return count;
	}
}
