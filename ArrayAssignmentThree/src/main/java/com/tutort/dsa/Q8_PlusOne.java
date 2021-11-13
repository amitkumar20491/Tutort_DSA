package com.tutort.dsa;

/*
 * https://leetcode.com/problems/plus-one/
 */
public class Q8_PlusOne {
	public int[] plusOne(int[] digits) {
		int sum = digits[digits.length - 1] + 1;
		if (sum < 10) {
			digits[digits.length - 1] = sum;
			return digits;
		} else {
			if (digits.length < 2) {
				digits[0] = sum % 10;
				return expandArrayByOne(digits);
			}

			int j = digits.length - 2;

			int mod = sum % 10;
			digits[digits.length - 1] = mod;
			while (j >= 0) {
				int sum2 = digits[j] + 1;
				if (sum2 < 10) {
					digits[j] = sum2;
					return digits;
				} else {
					if (j == 0) {
						digits[0] = sum2 % 10;
						return expandArrayByOne(digits);
					} else {
						digits[j] = sum2 % 10;
					}
				}
				j--;
			}
		}

		return digits;
	}

	public int[] expandArrayByOne(int[] digits) {
		int[] result = new int[digits.length + 1];
		result[0] = 1;
		System.arraycopy(digits, 0, result, 1, digits.length);
		return result;
	}
}
