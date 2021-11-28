package com.tutort.dsa;

/*
 * https://leetcode.com/problems/sort-array-by-parity-ii
 * TODO :  Bad Time Complexity : do it again
 */
public class Q8_SortArrayByParity2 {
	public int[] sortArrayByParityII(int[] nums) {
        int[] result = new int[nums.length];
        int evenIndex = 0;
        int OddIndex = 1;
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i]%2 == 0){
                result[evenIndex] = nums[i];
                evenIndex +=2;
            }else{
                result[OddIndex] = nums[i];
                OddIndex +=2;
            }
        }
        
        return result;
    }
}
