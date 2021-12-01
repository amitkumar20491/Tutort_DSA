package com.tutort.dsa;

/*
 * https://leetcode.com/problems/majority-element/
 */
public class Q6_MaxProfit {
	public int maxProfit(int[] prices) {
		int length = prices.length;
		int[] maxRight = new int[length];
		maxRight[length - 1] = prices[length - 1];

		for (int i = length - 2; i > -1; i--) {
			if (maxRight[i + 1] < prices[i]) {
				maxRight[i] = prices[i];
			} else {
				maxRight[i] = maxRight[i + 1];
			}
		}

		int maxProfit = -1;
		for (int i = 0; i < length; i++) {
			int profit = maxRight[i] - prices[i];
			if (profit > 0 && profit > maxProfit) {
				maxProfit = profit;
			}
		}

		return maxProfit > 0 ? maxProfit : 0;
	}
}
