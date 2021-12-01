package com.tutort.dsa;

/*
 * https://leetcode.com/problems/next-greater-element-i/submissions/
 */
public class Q10_NextGreaterElement {
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		for (int i = 0; i < nums1.length; i++) {
			int j = 0;
			while (j < nums2.length && nums2[j] != nums1[i]) {
				j++;
			}

			int result = -1;
			for (int k = j + 1; k < nums2.length; k++) {
				if (nums1[i] < nums2[k]) {
					result = nums2[k];
					break;
				}
			}

			nums1[i] = result;
		}

		return nums1;
	}
}
