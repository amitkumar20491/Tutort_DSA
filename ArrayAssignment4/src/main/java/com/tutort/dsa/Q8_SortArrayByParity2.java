package com.tutort.dsa;

/*
 * https://leetcode.com/problems/sort-array-by-parity-ii
 */
public class Q8_SortArrayByParity2 {
	public int[] sortArrayByParityII(int[] nums) {
        int i = 0, j = 1;
        
        while(i < nums.length && j < nums.length){
            if(nums[i] %2 == 0){
                i +=2;
                continue;
            }
            
            if(nums[j] %2 != 0){
                j +=2;
                continue;
            }
            
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        
        return nums;
    }
}
