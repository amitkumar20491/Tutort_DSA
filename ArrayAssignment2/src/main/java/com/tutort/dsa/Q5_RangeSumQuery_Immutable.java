package com.tutort.dsa;

/*
 * https://leetcode.com/problems/range-sum-query-immutable/
 */
public class Q5_RangeSumQuery_Immutable {

}

class NumArray {

	static int[] arr, sumArray;

	public NumArray(int[] nums) {
		int length = nums.length;
		arr = new int[length];
		sumArray = new int[length];
		arr = nums;
		int sum = 0;
		for (int i = 0; i < length; i++) {
			sum += arr[i];
			sumArray[i] = sum;
		}
	}

	public int sumRange(int left, int right) {
		return left > 0 ? sumArray[right] - sumArray[left - 1] : sumArray[right];
	}
}

/**
 * Your NumArray object will be instantiated and called as such: NumArray obj =
 * new NumArray(nums); int param_1 = obj.sumRange(left,right);
 */