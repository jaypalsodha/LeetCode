package com.leetcode.sorting;

import java.util.Arrays;

public class InsertionSort {

	/*
	 * Insertion sort is like playing card that we have we keep comparing the
	 * element one by one.
	 */

	public static void main(String[] args) {
		int[] elments = new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		new InsertionSort().sort(elments);
		System.out.println(Arrays.toString(elments));
	}

	public void sort(int[] elements) {
		int n = elements.length;
		for (int i = 1; i < n; i++) {
			int key = elements[i];
			int j = i - 1;

			while (j >= 0 && elements[j] > key) {
				elements[j + 1] = elements[j];
				j = j - 1;
			}
			elements[j + 1] = key;
		}
	}
}
