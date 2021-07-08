package com.leetcode.twodarray;

public class RotateMatrix {

	public static void main(String[] args) {

		int[][] matrix = new int[3][3];

		int length = matrix.length;
		System.out.println(length);
	}

	public void rotate(int[][] m) {

		mirrorSecondaryDiagonal(m);
		mirrorHorizontally(m);
	}

	private void mirrorHorizontally(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length - i - 1; j++) {
				int current = m[i][j];
				m[i][j] = m[m.length - j - 1][m.length - i - 1];
				m[m.length - j - 1][m.length - i - 1] = current;
			}
		}

	}

	private void mirrorSecondaryDiagonal(int[][] m) {

		for (int i = 0; i < m.length / 2; i++) {
			for (int j = 0; j < m.length; j++) {
				int current = m[i][j];
				m[i][j] = m[m.length - i - 1][j];
				m[m.length - i - 1][j] = current;

			}
		}

	}

	/*
	 * 
	 * [1, 2, 3], [4, 5, 6], [7, 8, 9]
	 * 
	 * 
	 * length = 3, i = 0 to length = 3, j = 0 to length - i - 1; == 3-0-1 = 2
	 * current = m[i][j] = 0,0 m[i][j] = m[3-0-1][3-0-1] = m[2][2] m[2][2] =
	 * current;
	 * 
	 * 
	 * i = 0, j = 1; current = m[i][j] = 0,1 , value = 2 m[i][j] = m[3-1-1][3-0-1] =
	 * m[1][2] m[1][2] = current;
	 * 
	 * 
	 * 
	 * i = 1, j = 0 ma[1][0] = m[3-0-1][3-1-1] = m[2][1]
	 * 
	 * 
	 * i = 1, j = 1,
	 * 
	 * m[1][1] =
	 * 
	 * 
	 */

}
