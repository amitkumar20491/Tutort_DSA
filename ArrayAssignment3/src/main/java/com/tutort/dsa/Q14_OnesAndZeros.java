package com.tutort.dsa;

/*
 * https://leetcode.com/problems/ones-and-zeroes/
 * Comment : Needed help in solution.
 */
public class Q14_OnesAndZeros {
	int[][][] dp;

	public int findMaxForm(String[] strs, int m, int n) {
		dp = new int[m + 1][n + 1][strs.length];
		return helper(strs, m, n, 0);
	}

	public int helper(String[] strs, int zeros, int ones, int index) {
		if (index == strs.length || zeros + ones == 0) {
			return 0;
		}

		if (dp[zeros][ones][index] != 0) {
			return dp[zeros][ones][index];
		}

		int[] count = count(strs[index]);
		int consider = 0;

		if (zeros >= count[0] && ones >= count[1]) {
			consider = 1 + helper(strs, zeros - count[0], ones - count[1], index + 1);
		}

		int skip = helper(strs, zeros, ones, index + 1);
		dp[zeros][ones][index] = Math.max(consider, skip);
		return dp[zeros][ones][index];
	}

	public int[] count(String str) {
		int[] count = new int[2];

		for (char ch : str.toCharArray()) {
			count[ch - '0']++;
		}

		return count;
	}
}
