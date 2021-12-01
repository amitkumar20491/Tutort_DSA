package com.tutort.dsa;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] twoSumInput = new int[] {2,7,11,15};
		int[] twoSumSorted = new int[] {-1,0};
		int[] nums1 = new int[] {2 , 0};
		int[] nums2 =  new int[] {1};
		int[] threeSumArray = new int[] {-1,0,1,2,-1,-4};
		int[] threeSumClosestArray = new int[] {0 , 2, 1 , -3}; 
		int[] fourSumArray = new int[] {2,2,2,2,2}; 
		//System.out.println(Arrays.toString(new Q1_TwoSum().twoSum(twoSumInput, 9)));
		//System.out.println(Arrays.toString(new Q2_TwoSumSorted().twoSum(twoSumSorted, -1)));
		//new Q3_MergeSortedArray().merge(nums1 , 2, nums2, 1);
		//System.out.println(new Q4_PascalTriangle().generate(5));
		//System.out.println(new Q5_PascalTriangle2().getRow(3));
		//System.out.println(new Q6_MaxProfit().maxProfit(twoSumInput));
		//System.out.println(new Q11_3Sum().threeSum(threeSumArray));
		//System.out.println(new Q13_3SumClosest().threeSumClosest(threeSumClosestArray, 1));
		System.out.println(new Q14_4Sum().fourSum(fourSumArray , 8));
	}
}
