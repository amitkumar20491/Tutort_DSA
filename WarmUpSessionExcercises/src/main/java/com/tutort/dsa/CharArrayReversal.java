package com.tutort.dsa;

//Given a char array , reverse it
public class CharArrayReversal {

	public char[] reverse(char[] input) {
		for (int i = 0, j = input.length - 1; i <= j; i++, j--) {
			char temp = input[i];
			input[i] = input[j];
			input[j] = temp;
		}
		return input;
	}
}
