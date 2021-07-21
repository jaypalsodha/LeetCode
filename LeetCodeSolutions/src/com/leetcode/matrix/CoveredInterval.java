package com.leetcode.matrix;

import java.util.Arrays;

public class CoveredInterval {

	public static void main(String[] args) {

		int[][] matrix = new int[][] { { 1, 4 }, { 3, 6 }, { 2, 8 } };

		new CoveredInterval().removeCoveredIntervals(matrix);

	}

	public int removeCoveredIntervals(int[][] intervals) {

		Arrays.sort(intervals, (a, b) -> a[0] != b[0] ? a[0] - b[0] : b[1] - a[1]);

		int removed = 0, last = -1;

		for (int[] is : intervals) {
			if (is[1] <= last) {
				removed++;
			} else {
				last = is[1];
			}
		}
		return intervals.length - removed;
	}

}
