package com.tutort.dsa;

//Given a char array, find the maximum occurring character. 
public class MaxFrequencyChar {

	public char maxumumCharFrequency(char[] input) {
		int[] frequency = new int[255];
		char maxChar = input[0];
		int maxFrequency = 1;
		for (int i = 0; i < input.length; i++) {
			int asciiIndex = (int) input[i];
			frequency[asciiIndex] = frequency[asciiIndex] + 1;

			if (maxFrequency < frequency[asciiIndex]) {
				maxFrequency = frequency[asciiIndex];
				maxChar = input[i];
			}
		}

		return maxChar;
	}
}
