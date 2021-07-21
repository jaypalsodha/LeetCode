package com.leetcode.arrays;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SlidingWindow {

	/*
	 * Leetcode 239
	 */

	public static void main(String[] args) {

		int[] maxSlidingWindow = new SlidingWindow().maxSlidingWindow(new int[] {1,3,-1,-3,5,3,6,7}, 3);
		System.out.println(Arrays.toString(maxSlidingWindow));
	}

	public int[] maxSlidingWindow(int[] nums, int k) {
		int n = nums.length;
		if (n == 0 || k == 0) {
			return new int[0];
		}
		int[] result = new int[n - k + 1];
		Deque<Integer> win = new ArrayDeque<>();

		for (int i = 0; i < n; ++i) {
			// remove indices that are out of bound
			while (win.size() > 0 && win.peekFirst() <= i - k) {
				win.pollFirst();
			}
			// remove indices whose corresponding values are less than nums[i]
			while (win.size() > 0 && nums[win.peekLast()] < nums[i]) {
				win.pollLast();
			}
			// add nums[i]
			win.offerLast(i);
			// add to result
			if (i >= k - 1) {
				result[i - k + 1] = nums[win.peekFirst()];
			}
		}
		return result;
	}
}
