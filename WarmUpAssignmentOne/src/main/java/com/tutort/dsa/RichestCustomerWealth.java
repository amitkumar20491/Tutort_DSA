package com.tutort.dsa;

// https://leetcode.com/problems/richest-customer-wealth/
public class RichestCustomerWealth {

	public int maximumWealth(int[][] accounts) {
		int maxWealth = accounts[0][0];
		for (int i = 0; i < accounts.length; i++) {
			int wealth = 0;
			for (int j = 0; j < accounts[i].length; j++) {
				wealth = wealth + accounts[i][j];
			}
			if (wealth > maxWealth) {
				maxWealth = wealth;
			}
		}

		return maxWealth;
	}
}
