package com.leetcode.sorting;

import java.util.Arrays;

public class SelectionSort {
	/*
	 * find the minimum element from sub array and move that to the first position
	 * of sub array
	 * 
	 * Time Complexity = O (n2) Auxiliary Space Complexity = O (1)
	 */
	public static void main(String[] args) {

		int[] elements = new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		new SelectionSort().sort(elements);
		System.out.println(Arrays.toString(elements));
	}

	public void sort(int[] e) {
		int n = e.length;
		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < e.length; j++) {
				if (e[minIndex] > e[j]) {
					minIndex = j;
				}
			}
			int temp = e[minIndex];
			e[minIndex] = e[i];
			e[i] = temp;
		}
	}
}
