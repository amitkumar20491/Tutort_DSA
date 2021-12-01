package com.tutort.dsa;

/*
 * https://leetcode.com/problems/sum-of-all-subset-xor-totals/
 * TODO : Bad Time complexity do it again
 */
public class Q4_SubsetXORTotals {
	public int subsetXORSum(int[] nums) {
        int totalSubset = (int) Math.pow(2 , nums.length);
        int xorTotal =0;
        for(int i = 0 ; i < totalSubset ; i ++){
            int pos = i;
            int xorSum =0;
            for(int j = nums.length - 1 ; j >= 0 ; j--){
                int r = pos%2;
                pos = pos/2;
                
                if(r == 1){
                    xorSum ^= nums[j];
                }
            }
            xorTotal += xorSum;
        }
        
        return xorTotal;
    }
}
