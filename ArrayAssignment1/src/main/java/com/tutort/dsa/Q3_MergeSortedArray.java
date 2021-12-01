package com.tutort.dsa;

/*
 * Problem : https://leetcode.com/problems/merge-sorted-array
 */

public class Q3_MergeSortedArray {

	void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1 ;
        int j = n -1;      
        int k = nums1.length - 1;
        
        while (k > -1 && j > -1){
            if(i <= -1){
                nums1[k] = nums2[j]; 
                k--;
                j--;
                continue;
            }
            
            if(nums1[i] > nums2[j]){
               nums1[k] = nums1[i];
               nums1[i] = 0;
               i--;
               k--;
              continue;
            }
            
            if(nums1[i] <= nums2[j]){
               nums1[k] = nums2[j];
               j--;
               k--;
               continue;
            }
        }
    }

}
