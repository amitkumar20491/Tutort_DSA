package com.tutort.dsa;

/*
 * https://leetcode.com/problems/can-place-flowers
 */
public class Q7_CanPlaceFlowers {
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		int count = 0;

		if (flowerbed.length == 1 && flowerbed[0] == 0) {
			count++;
		}

		if (flowerbed.length >= 2 && flowerbed[0] == 0 && flowerbed[1] == 0) {
			flowerbed[0] = 1;
			count++;
		}

		for (int i = 1; i < flowerbed.length - 2; i++) {
			if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0 && flowerbed[i] == 0) {
				flowerbed[i] = 1;
				count++;
			}
		}

		if (flowerbed.length >= 2 && flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0) {
			flowerbed[flowerbed.length - 1] = 1;
			count++;
		}

		return count >= n ? true : false;
	}
}
