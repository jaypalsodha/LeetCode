package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class NumberDisappear {

	public static void main(String[] args) {
		System.out.println(new NumberDisappear().findDisappearedNumbers(new int[] { 1, 2, 2, 4, 1 }));
	}

	public List<Integer> findDisappearedNumbers(int[] nums) {

		for (int i = 0; i < nums.length; i++) {

			int index = nums[i];
			int elementAt = index - 1;
			if (nums[elementAt] > 0) {
				nums[elementAt] *= -1;
			}
		}
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				list.add(i + 1);
			}
		}
		return list;
	}

	/*
	 * 448. Find All Numbers Disappeared in an Array Easy
	 * 
	 * 4462
	 * 
	 * 310
	 * 
	 * Add to List
	 * 
	 * Share Given an array nums of n integers where nums[i] is in the range [1, n],
	 * return an array of all the integers in the range [1, n] that do not appear in
	 * nums.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [4,3,2,7,8,2,3,1] Output: [5,6]
	 * 
	 * Example 2:
	 * 
	 * Input: nums = [1,1] Output: [2]
	 * 
	 * 
	 * Constraints:
	 * 
	 * n == nums.length 1 <= n <= 105 1 <= nums[i] <= n
	 * 
	 * 
	 * Follow up: Could you do it without extra space and in O(n) runtime? You may
	 * assume the returned list does not count as extra space.
	 * 
	 * 
	 */
}
