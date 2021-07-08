package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicate {

	public static void main(String[] args) {
		System.out.println(new FindDuplicate().findDuplicates(new int[] { 4, 3, 2, 7, 8, 2, 3, 1 }));
	}

	public List<Integer> findDuplicates(int[] nums) {

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			int n = Math.abs(nums[i]);
			if (nums[n - 1] < 0) {
				list.add(n);
			} else {
				nums[n - 1] = -nums[n - 1];
			}
		}
		return list;
	}

	/*
	 * 
	 * 442. Find All Duplicates in an Array Medium
	 * 
	 * 3855
	 * 
	 * 188
	 * 
	 * Add to List
	 * 
	 * Share Given an integer array nums of length n where all the integers of nums
	 * are in the range [1, n] and each integer appears once or twice, return an
	 * array of all the integers that appears twice.
	 * 
	 * You must write an algorithm that runs in O(n) time and uses only constant
	 * extra space.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [4,3,2,7,8,2,3,1] Output: [2,3]
	 * 
	 * Example 2:
	 * 
	 * Input: nums = [1,1,2] Output: [1]
	 * 
	 * Example 3:
	 * 
	 * Input: nums = [1] Output: []
	 * 
	 * 
	 * Constraints:
	 * 
	 * n == nums.length 1 <= n <= 105 1 <= nums[i] <= n Each element in nums appears
	 * once or twice.
	 */
}
