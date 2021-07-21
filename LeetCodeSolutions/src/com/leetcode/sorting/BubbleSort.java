package com.leetcode.sorting;

import java.util.Arrays;

public class BubbleSort {

	/*
	 * Average and worst case time complexity = O (n2)
	 * 
	 * Best Case time complexity = O(n), when all the elements are sorted. Auxiliary
	 * Space Complexity = O (1);
	 */
	public static void main(String[] args) {

		int[] elments = new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		new BubbleSort().bubbleSort(elments);
		System.out.println(Arrays.toString(elments));

		int[] elments1 = new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		new BubbleSort().bubbleSortImproved(elments1);
		System.out.println(Arrays.toString(elments1));
	}

	public void bubbleSort(int[] elements) {
		int n = elements.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (elements[j] > elements[j + 1]) {
					int temp = elements[j];
					elements[j] = elements[j + 1];
					elements[j + 1] = temp;
				}
			}
		}
	}

	/*
	 * this is the improved version of bubble sort if the elements are already
	 * sorted than the Time Complexity = O (n); Auxiliary Space Complexity = O(1);
	 * bubble sort is stable sort algorithm Sorting in place : Yes
	 */
	public void bubbleSortImproved(int[] elements) {
		int n = elements.length;
		boolean elementSwapped;
		for (int i = 0; i < elements.length; i++) {
			elementSwapped = false;
			for (int j = 0; j < n - i - 1; j++) {

				if (elements[j] > elements[j + 1]) {
					int temp = elements[j];
					elements[j] = elements[j + 1];
					elements[j + 1] = temp;
					elementSwapped = true;
				}
				if (!elementSwapped) {
					break;
				}
			}
		}
	}
}
