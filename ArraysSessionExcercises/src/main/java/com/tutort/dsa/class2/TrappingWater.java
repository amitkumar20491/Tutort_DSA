package com.tutort.dsa.class2;

/*
 * https://leetcode.com/problems/trapping-rain-water/ 
 */
public class TrappingWater {
	public int trap(int[] height) {
		int length = height.length;
		int[] LeftBound = new int[length];
		int[] rightBound = new int[length];
		int barHeight = 1;
		int total = 0;

		LeftBound[0] = height[0];
		rightBound[length - 1] = height[length - 1];

		// calculate the tallest from left for current
		for (int i = 1; i < length; i++) {
			LeftBound[i] = Math.max(height[i], LeftBound[i - 1]);
		}

		// calculate the tallest from right for current
		for (int i = length - 2; i >= 0; i--) {
			rightBound[i] = Math.max(height[i], rightBound[i + 1]);
		}

		for (int i = 0; i < length; i++) {
			total += Math.min(LeftBound[i], rightBound[i]) - (height[i] * barHeight);
		}

		return total;
	}
}
