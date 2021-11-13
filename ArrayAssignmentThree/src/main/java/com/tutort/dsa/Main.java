package com.tutort.dsa;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		//System.out.println(new Q2_ThirdMaximumNumber().thirdMax(new int[] {2 ,2 , 3, 1}));
		//System.out.println(new Q6_FindShortestSubArray().findShortestSubArray(new int[] {1,2,2,3,1,4,2}));
		//System.out.println(new Q7_CanPlaceFlowers().canPlaceFlowers(new int[] {1,0,1,0,0}, 1));
		printIntArray(new Q8_PlusOne().plusOne(new int[] {9,8,9}));
		//System.out.println(new Q1_FindCommonCharacters().commonChars(new String[] {"bella","label","roller"}));
	}
	
	static void printIntArray(int[] nums){
		System.out.println(Arrays.toString(nums));
	}

}
