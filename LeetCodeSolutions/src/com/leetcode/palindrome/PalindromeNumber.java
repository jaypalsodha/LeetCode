package com.leetcode.palindrome;

public class PalindromeNumber {

	// check whether the number is palindrome or not.
	// if the number is negative than it is not palidrome
	// if the number is ends with 0 and if it is greater than 0 than
	// the number is not palidrome i.e 10, 20, 30,

	public static void main(String[] args) {
		System.out.println(new PalindromeNumber().isPalidrome(12321));
	}

	public boolean isPalidrome(int n) {
		if (isNegativeNumber(n) || nuumberEndsWithZero(n)) {
			return false;
		}
		int reversedNumber = 0;
		while (n > reversedNumber) {
			int popLastNumber = n % 10;
			reversedNumber = reversedNumber * 10 + popLastNumber;
			n = n / 10;
		}

		return (isEventDigitsMatched(n, reversedNumber) || isOddDigitsMatched(n, reversedNumber));
	}

	private boolean isOddDigitsMatched(int n, int reversedNumber) {
		return n == reversedNumber / 10;
	}

	private boolean isEventDigitsMatched(int n, int reversedNumber) {
		return n == reversedNumber;
	}

	private boolean nuumberEndsWithZero(int n) {
		return n % 10 == 0 && n != 0;
	}

	private boolean isNegativeNumber(int n) {
		return n < 0;
	}
}
