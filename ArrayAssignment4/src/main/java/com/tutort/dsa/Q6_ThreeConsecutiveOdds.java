package com.tutort.dsa;

/*
 * https://leetcode.com/problems/three-consecutive-odds/
 */
public class Q6_ThreeConsecutiveOdds {
	public boolean threeConsecutiveOdds(int[] arr) {
		boolean result = false;
		int consecutiveOdds = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				consecutiveOdds++;
			} else {
				consecutiveOdds = 0;
			}

			if (consecutiveOdds == 3) {
				result = true;
				break;
			}
		}

		return result;
	}
}
