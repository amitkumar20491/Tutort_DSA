package com.tutort.dsa;

/*
 * Given a number N. Your task is to check whether it is fascinating or not.
Fascinating Number: When a number(should contain 3 digits or more) is multiplied by 2 and 3 ,and
when both these products are concatenated with the original number, then it results in all digits from 1
to 9 present exactly once.
 */
public class Q10_FacinatingNumber {

	private static final String fascinating = "Fascinating";
	private static final String not_fascinating = "Not Fascinating";

	public String isFacinating(int num) {
		if (String.valueOf(num).length() < 3) {
			return not_fascinating;
		}
		String target = Integer.toString(num) + Integer.toString(num * 2) + Integer.toString(num * 3);
		System.out.println(target);
		return checkFacinating(target);
	}

	private String checkFacinating(String number) {
		if (number.contains("1") && number.contains("2") && number.contains("3") && number.contains("4")
				&& number.contains("5") && number.contains("6") && number.contains("7") && number.contains("8")
				&& number.contains("9")) {
			return fascinating;
		}

		return not_fascinating;
	}
}
