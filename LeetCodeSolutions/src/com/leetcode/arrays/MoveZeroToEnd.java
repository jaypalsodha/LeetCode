package com.leetcode.arrays;

import java.util.Arrays;

public class MoveZeroToEnd {

	public static void main(String[] args) {

		System.out.println(Arrays.toString(moveZeroes(new int[] { 0, 1, 0, 3, 12 })));

	}

	public static int[] moveZeroes(int[] nums) {
		int current = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[current] = nums[i];
				current++;
			}
		}
		for (int i = current; i < nums.length; i++) {
			nums[i] = 0;
		}
		return nums;
	}

	/*
	 * 283. Move Zeroes Easy
	 * 
	 * 5943
	 * 
	 * 177
	 * 
	 * Add to List
	 * 
	 * Share Given an integer array nums, move all 0's to the end of it while
	 * mainta- ining the relative order of the non-zero elements.
	 * 
	 * Note that you must do this in-place without making a copy of the array.
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [0,1,0,3,12] Output: [1,3,12,0,0] Example 2:
	 * 
	 * Input: nums = [0] Output: [0]
	 * 
	 * 
	 * Constraints:
	 * 
	 * 1 <= nums.length <= 104 -231 <= nums[i] <= 231 - 1
	 */
}
