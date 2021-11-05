package com.tutort.dsa.class4;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		printIntArray(new PrisionCell().prisonAfterNDays(new int[] {0,1,0,1,1,0,0,1}, 7));
	}

	static void printIntArray(int[] nums) {
		System.out.println(Arrays.toString(nums));
	}
}
