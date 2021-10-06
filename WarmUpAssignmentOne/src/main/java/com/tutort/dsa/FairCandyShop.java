package com.tutort.dsa;

// https://leetcode.com/problems/fair-candy-swap
// Need to find a better logic
public class FairCandyShop {
	public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
		int aliceCandies = findSum(aliceSizes);
		int bobCandies = findSum(bobSizes);
		int[] result = new int[2];
		int diffrence;

		if (aliceCandies > bobCandies) {
			diffrence = (aliceCandies - bobCandies) / 2;
			for (int i = 0; i < aliceSizes.length; i++) {
				for (int j = 0; j < bobSizes.length; j++) {
					if (aliceSizes[i] - bobSizes[j] == diffrence) {
						return new int[] { aliceSizes[i], bobSizes[j] };
					}
				}
			}
		} else {
			diffrence = (bobCandies - aliceCandies) / 2;
			for (int i = 0; i < aliceSizes.length; i++) {
				for (int j = 0; j < bobSizes.length; j++) {
					if (bobSizes[j] - aliceSizes[i] == diffrence) {
						return new int[] { aliceSizes[i], bobSizes[j] };
					}
				}
			}
		}

		return null;
	}

	public int findSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
}
