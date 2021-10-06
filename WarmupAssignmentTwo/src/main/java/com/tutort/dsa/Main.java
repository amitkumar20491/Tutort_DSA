package com.tutort.dsa;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int arr[] =  new int[] {1, 2, 4, 5, 8, 10};
		int[] perfect_array = new int[] {1, 2, 3, 2, 1};
		int[] final_element_arr = new int[] {8, 1, 2, 9, 4, 3, 7, 5};
		int[] balanced_array1 = new int[] {1, 5, 3, 2};
		int[] balanced_array2 = new int[] { 1, 2, 1, 2, 1, 3 };
		System.out.println(new Q1_SumOfAllIntegers().findSum(arr));
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(new Q2_ElementAtIndex().findElementAtIndex(arr, 3));
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(new Q3_FindElementsLessThanTarget().findElementLessThanTarget(arr, 9));
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		new Q4_ArrayElementInAlternateOrder().printElementInAlternateOrder(arr);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(new Q5_IndexValueMatch().findIndexValueMatch(arr));
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(new Q6_PerfectArray().isPerfectArray(arr));
		System.out.println(new Q6_PerfectArray().isPerfectArray(perfect_array));
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(new Q7_FinalElement().finalElement(arr));
		System.out.println(new Q7_FinalElement().finalElement(perfect_array));
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(Arrays.toString(new Q8_ReturnAllExceptGreatestTwo().allExpectGreatestTwo(arr)));
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(new Q9_SeriesSum().sumOfSeries(5));
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(new Q10_FacinatingNumber().isFacinating(192));
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(new Q11_Bonus_BalancedArray().minimumAdditionForBalance(balanced_array1));
		System.out.println(new Q11_Bonus_BalancedArray().minimumAdditionForBalance(balanced_array2));
	}

}
