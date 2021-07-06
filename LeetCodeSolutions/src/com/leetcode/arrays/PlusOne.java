package com.leetcode.arrays;

import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		int[] plusOne = plusOne(new int[] { 1, 0, 0, 0 });
		System.out.println(Arrays.toString(plusOne));
	}

	public static int[] plusOne(int[] digits) {

		int curry = 1;

		for (int i = digits.length - 1; i >= 0; i--) {
			if (curry == 1) {
				int sum = digits[i] + 1;
				if (sum >= 10) {
					digits[i] = 0;
					curry = 1;
				} else {
					digits[i] = sum;
					curry = 0;
				}
			} else {
				curry = 0;
				break;
			}
		}
		if (curry == 1) {

			int[] newDigits = new int[digits.length + 1];
			newDigits[0] = 1;
			for (int i = 1; i < newDigits.length; i++) {
				newDigits[i] = digits[i - 1];
			}
			return newDigits;
		} else {
			return digits;
		}
	}
}
