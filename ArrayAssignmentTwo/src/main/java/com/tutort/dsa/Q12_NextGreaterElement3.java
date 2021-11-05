package com.tutort.dsa;

/*
 * https://leetcode.com/problems/next-greater-element-iii/
 */
public class Q12_NextGreaterElement3 {
	public int nextGreaterElement(int n) {
		char[] nchar = ("" + n).toCharArray();
		int i = nchar.length - 2;
		int j = nchar.length - 1;
		
		while (i >= 0 && nchar[i] >= nchar[i + 1]) {
			i--;
		}
		
		if(i < 0 ) {
			return -1;
		}
		
		while(j > i && nchar[j] <= nchar[i]) {
			j--;
		}
		
		swap(nchar , i , j);
		reverse(nchar, i+1);
		
		try {
			return Integer.parseInt(new String(nchar));
		}catch (Exception e) {
			return -1;
		}
	}
	
	private void swap(char[] arr , int i , int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp; 
	}
	
	private void reverse(char[] arr , int start) {
		int left = start , right = arr.length -1;
		
		while(left < right) {
			swap(arr , left , right);
			left++;
			right--;
		}
	}
}
