package com.leetcode.matrix;

import java.util.Arrays;

public class MatrixTraversal {

	public static void main(String[] args) {

		int[][] n = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		MatrixTraversal matrixTraversal = new MatrixTraversal();
		matrixTraversal.traverseEachElement(n);
		System.out.println();
		matrixTraversal.printRow(n);
		matrixTraversal.printDeepToString(n);
		matrixTraversal.findSizeOfMatrixRow(n);
		matrixTraversal.findSizeOfMatrixColumn(n);

		Character[] vowels = { 'a', 'e', 'i', 'o', 'u' };

	}

	public void printDeepToString(int[][] mat) {
		String deepToString = Arrays.deepToString(mat);
		System.out.println(deepToString);
	}

	public void printRow(int[][] mat) {

		for (int[] is : mat) {
			System.out.println(Arrays.toString(is));
		}
	}

	public void traverseEachElement(int[][] mat) {

		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
		}
	}

	public void findSizeOfMatrixRow(int[][] mat) {
		System.out.println("length of row : " + mat.length);
	}

	public void findSizeOfMatrixColumn(int[][] mat) {
		System.out.println("length of column : " + mat[0].length);
	}

}
