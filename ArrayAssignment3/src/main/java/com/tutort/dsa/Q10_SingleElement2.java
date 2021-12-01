package com.tutort.dsa;

import java.util.*;

/*
 * https://leetcode.com/problems/single-number-ii/
 */
public class Q10_SingleElement2 {
	public int singleNumber(int[] nums) {
       Map<Integer, Integer> frequencyMap = new HashMap<>();
		
        for(int i = 0 ; i < nums.length ; i++){
            if(frequencyMap.containsKey(nums[i])){
                frequencyMap.put(nums[i] , frequencyMap.get(nums[i]) + 1);
            }else{
                frequencyMap.put(nums[i] , 1);
            }    
        }
        
        for(Integer a : frequencyMap.keySet()){
            if(frequencyMap.get(a) == 1){
                return a;
            }
        }
        
        return 0;
    }
}
