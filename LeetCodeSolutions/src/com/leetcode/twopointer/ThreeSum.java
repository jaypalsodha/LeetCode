package com.leetcode.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public List<List<Integer>> threeSum(int[] nums) {

		List<List<Integer>> list = new ArrayList<>();
		// [-4, -1, -1, 0, 1, 2]
		if (nums == null || nums.length < 3) {
			return list;
		}
		Arrays.sort(nums);
		int low = 0, high = nums.length - 1;

		for (int i = 0; i < nums.length - 2; i++) {
			if (i == 0 || (i > 0 && nums[i - 1] != nums[i])) {
				int sum = 0 - nums[i];
				low = i + 1;
				high = nums.length - 1;
				while (low < high) {
					if (sum == nums[low] + nums[high]) {
						List<Integer> tempList = new ArrayList<>();
						tempList.add(nums[i]);
						tempList.add(nums[low]);
						tempList.add(nums[high]);
						list.add(tempList);
						while (low < high && nums[low] == nums[low + 1]) {
							low++;
						}
						while (low < high && nums[high] == nums[high - 1]) {
							high--;
						}
						low++;
						high--;
					} else if (sum > nums[low] + nums[high]) {
						low++;
					} else {
						high--;
					}
				}
			}
		}
		return list;
	}
}
