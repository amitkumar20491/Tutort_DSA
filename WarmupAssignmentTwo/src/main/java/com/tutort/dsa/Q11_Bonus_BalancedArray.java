package com.tutort.dsa;

/*
 * Given an array of even size N, task is to find minimum value that can be added to an element so that
array become balanced. An array is balanced if the sum of the left half of the array elements is equal
to the sum of right half.
 */
public class Q11_Bonus_BalancedArray {
	
	public int minimumAdditionForBalance(int[] arr){
		int leftSum = 0;
		int rightSum = 0;
		
		for(int i = 0 , j = arr.length -1; i <= arr.length/2 && j >= arr.length/2 ; i++ , j-- ) {
			leftSum = leftSum + arr[i];
			rightSum = rightSum + arr[j];
		}

		return Math.abs(leftSum - rightSum);
	}
}
