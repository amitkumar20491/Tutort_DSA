package com.tutort.dsa;

/*
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii
 */
public class Q7_MaxProfit2 {
	public int maxProfit(int[] prices) {
		int length = prices.length;
		int maxProfit = 0;

		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				int high = j;
				if (prices[i] > prices[j]) {
					break;
				} else {
					if (prices[j] > prices[high]) {
						high = j;
						continue;
					} else {
						maxProfit = maxProfit + (prices[high] - prices[i]);
						i = high;
					}
				}
			}
		}

		return maxProfit;
	}
}
