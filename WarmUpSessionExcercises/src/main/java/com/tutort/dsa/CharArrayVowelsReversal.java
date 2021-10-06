package com.tutort.dsa;

//Given a char array , reverse only vowels
public class CharArrayVowelsReversal {

	public char[] reverseVowels(char[] input) {
		String vowels = "aeiouAEIOU";
		int i = 0;
		int j = input.length - 1;

		while (i < j) {
			if (!(vowels.indexOf(input[i]) > -1)) {
				i++;
				continue;
			}

			if (!(vowels.indexOf(input[j]) > -1)) {
				j--;
				continue;
			}

			char temp = input[i];
			input[i] = input[j];
			input[j] = temp;
			i++;
			j--;
		}
		return input;
	}
}
