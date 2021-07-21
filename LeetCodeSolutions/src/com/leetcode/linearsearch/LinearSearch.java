package com.leetcode.linearsearch;

public class LinearSearch {
	public static void main(String[] args) {
		int[] items = new int[] { 12, 22, 33, 44, 55, 66, 80 };
		System.out.println(new LinearSearch().search(items, 56));
	}

	public int search(int[] items, int x) {

		for (int i = 0; i < items.length; i++) {
			if (items[i] == x) {
				return i;
			}
		}
		return -1;
	}
}
