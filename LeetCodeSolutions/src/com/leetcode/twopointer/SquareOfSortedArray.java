package com.leetcode.twopointer;

import java.util.Arrays;

public class SquareOfSortedArray {

	/*
	 * leetcode 977
	 */
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(new SquareOfSortedArray().sortedSquares(new int[] {-7,-3,2,3,11} )));

	}

	public int[] sortedSquares(int[] nums) {

		int p1 = 0;
		int p2 = nums.length - 1;
		int[] output = new int[nums.length];
		int current = nums.length - 1; // to store elements from right to left

		while (p1 <= p2) {
			int temp1 = nums[p1] * nums[p1];
			int temp2 = nums[p2] * nums[p2];

			if (temp1 > temp2) {
				output[current] = temp1;
				p1++;
			} else {
				output[current] = temp2;

				p2--;
			}
			current--;
		}
		return output;
	}
}
