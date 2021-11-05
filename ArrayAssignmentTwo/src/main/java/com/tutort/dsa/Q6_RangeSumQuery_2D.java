package com.tutort.dsa;

/*
 * https://leetcode.com/problems/range-sum-query-2d-immutable/
 */
public class Q6_RangeSumQuery_2D {
	public static void main(String[] args) {
		int[][] matrix = new int[][] { { 3, 0, 1, 4, 2 }, { 5, 6, 3, 2, 1 }, { 1, 2, 0, 1, 5 }, { 4, 1, 0, 1, 7 },
				{ 1, 0, 3, 0, 5 } };
		NumMatrix obj = new NumMatrix(matrix);
		System.out.println(obj.sumRegion(2, 1, 4, 3));
	}
}

class NumMatrix {

	static int[][] matrix;

	public NumMatrix(int[][] matrix) {
		NumMatrix.matrix = matrix;
		
		//calculate running sum of rows
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				matrix[i][j] = matrix[i][j] + matrix[i][j - 1];
			}
		}
	}

	public int sumRegion(int row1, int col1, int row2, int col2) {
		int sum = 0;
		for (int i = row1; i <= row2; i++) {
			if (col1 > 0) {
				sum = sum + (matrix[i][col2] - matrix[i][col1 - 1]);
			} else {
				sum = sum + matrix[i][col2];
			}
		}
		return sum;
	}
}

/**
 * Your NumMatrix object will be instantiated and called as such: NumMatrix obj
 * = new NumMatrix(matrix); int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
