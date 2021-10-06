package com.tutort.dsa;

//Given a char array, find the maximum occurring character. optimized with 26 size array
public class MaxFrequencyCharOptimised {

	public char maxumumCharFrequency(char[] input) {
		int[] frequency = new int[25];
		char maxChar = input[0];
		int maxFrequency = 1;
		for (int i = 0; i < input.length; i++) {
			int asciiIndex = ((int) input[i]) - ((int) 'a');
			frequency[asciiIndex] = frequency[asciiIndex] + 1;

			if (maxFrequency < frequency[asciiIndex]) {
				maxFrequency = frequency[asciiIndex];
				maxChar = input[i];
			}
		}

		return maxChar;
	}
}
