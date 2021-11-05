package com.tutort.dsa.class5;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] decompressRLEListArray = new int[] {1,2,3,4};
		char[] stringDecompression = new char[] {'a','a','b','b','c','c','c'}; 
		//printArray(new DecompessRLEList().decompressRLElist(decompressRLEListArray));
		System.out.println(new StringCompression().compress(stringDecompression));
	}
	
	public static void printArray(int[] nums) {
		System.out.println(Arrays.toString(nums));
	}

}
