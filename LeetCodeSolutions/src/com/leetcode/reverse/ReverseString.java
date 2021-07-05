package com.leetcode.reverse;

public class ReverseString {

	// reverse the string using constant space complexity
	// [ h e l l o]
	// use the pointer for left and right.
	// move left pointer forward and right pointer backward

	public static void main(String[] args) {
		reverseString(new char[] { 'h', 'e', 'l', 'l', 'o' });
	}

	public static void reverseString(char[] s) {
		int left = 0;
		int right = s.length - 1;

		while (left < right) {
			s[left] = (char) (s[left] + s[right]);
			s[right] = (char) (s[left] - s[right]);
			s[left] = (char) (s[left] - s[right]);
			left++;
			right--;
		}
		System.out.println(s);
	}
}
