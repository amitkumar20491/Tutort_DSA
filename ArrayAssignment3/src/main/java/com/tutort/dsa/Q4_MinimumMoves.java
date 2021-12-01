package com.tutort.dsa;

/*
 * https://leetcode.com/problems/minimum-moves-to-equal-array-elements/
 */
public class Q4_MinimumMoves {
	public int minMoves(int[] nums) {
		int min = Integer.MAX_VALUE;

		for (int num : nums) {
			min = Math.min(num, min);
		}

		int moves = 0;
		for (int num : nums) {
			moves += num - min;
		}

		return moves;
	}
}
