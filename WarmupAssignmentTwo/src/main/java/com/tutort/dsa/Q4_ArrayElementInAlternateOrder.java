package com.tutort.dsa;

/*
 * You are given an array A of size N. You need to print elements of A in alternate order (starting
from index 0).
 */
public class Q4_ArrayElementInAlternateOrder {

	public void printElementInAlternateOrder(int[] arr) {
		for (int i = 0; i < arr.length; i += 2) {
			System.out.println(arr[i]);
		}
	}

}
