package com.tutort.dsa;

/*
 * https://leetcode.com/problems/rotate-image/
 */
public class Q15_RotateImage {
	public void rotate(int[][] matrix) {
		int n = matrix.length;

		// transpose
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}

		// reverse rows
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n / 2; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][(n - 1) - j];
				matrix[i][(n - 1) - j] = temp;
			}
		}
	}
}
