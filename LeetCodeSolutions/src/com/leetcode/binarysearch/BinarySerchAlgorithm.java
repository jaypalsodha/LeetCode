package com.leetcode.binarysearch;

public class BinarySerchAlgorithm {

	public static void main(String[] args) {

		int[] items = new int[] { 12, 22, 33, 44, 55, 66, 80 };
		System.out.println(new BinarySerchAlgorithm().search(items, 44));
	}

	public int search(int[] elements, int x) {

		int low = 0;
		int high = elements.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (elements[mid] == x) {
				return mid;
			} else if (x > elements[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}
}
