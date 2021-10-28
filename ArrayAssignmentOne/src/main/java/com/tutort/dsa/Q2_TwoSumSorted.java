package com.tutort.dsa;

/*
 * Problem : https://leetcode.com/problems/two-sum-ii-input-array-is-sorted
 */

public class Q2_TwoSumSorted {
	public int[] twoSum(int[] numbers, int target) {
		int length = numbers.length;
		int left = 0;
		int right = length - 1;
		int[] result = new int[2];
		while (numbers[right] < target && length < 2) {
			right = right / 2;
		}

		while (right > left) {
			int sum = numbers[left] + numbers[right];

			if (sum == target) {
				result = new int[] { left + 1, right + 1 };
				break;
			}

			if (sum > target) {
				right--;
				continue;
			}

			if (sum < target) {
				left++;
				continue;
			}
		}

		return result;
	}
}
