package com.tutort.dsa;

/*
 * https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
 */
public class Q5_CountNegativeInSortedMatrix {
	public int countNegatives(int[][] grid) {
		int row = grid.length;
		int col = grid[0].length;
		int result = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (grid[i][j] < 0) {
					result += (col - j);
					break;
				}
			}
		}

		return result;
	}
}
