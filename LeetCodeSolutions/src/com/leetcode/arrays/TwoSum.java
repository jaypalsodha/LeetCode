package com.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	/*
	 * Given an array of integers nums and an integer target, return indices of the
	 * two numbers such that they add up to target.
	 * 
	 * You may assume that each input would have exactly one solution, and you may
	 * not use the same element twice.
	 * 
	 * You can return the answer in any order.
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [2,7,11,15], target = 9 Output: [0,1] Output: Because nums[0] +
	 * nums[1] == 9, we return [0, 1].
	 * 
	 * Example 2:
	 * 
	 * Input: nums = [3,2,4], target = 6 Output: [1,2] Example 3:
	 * 
	 * Input: nums = [3,3], target = 6 Output: [0,1]
	 * 
	 * 
	 * Constraints:
	 * 
	 * 2 <= nums.length <= 104 -109 <= nums[i] <= 109 -109 <= target <= 109 Only one
	 * valid answer exists.
	 */

	/*
	 * Solutions :
	 * 
	 * we will use HashMap to solve this problem.
	 * 
	 * we will check Whether the target - current element is present in the map or
	 * not,
	 * 
	 * if it is present than we will return the index of present element and the
	 * current element
	 * 
	 * if it is not present than we will keep adding the current element to the
	 * hashMap
	 * 
	 */

	public static int[] twoSum(int[] nums, int target) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {

			int diff = target - nums[i];
			if (map.containsKey(diff)) {
				return new int[] { map.get(diff), nums[i] };
			} else {
				map.put(nums[i], i);
			}
			throw new IllegalStateException("two number with sum are not present");
		}

		return null;
	}
}
