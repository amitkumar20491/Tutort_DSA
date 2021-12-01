package com.tutort.dsa;

import java.util.*;
/*
 * https://leetcode.com/problems/kids-with-the-greatest-number-of-candies
 */
public class Q3_KidsWithGreatestCandies {
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int length = candies.length;
        int max =  candies[0];
        List<Boolean> result = new ArrayList<>();
        for(int i = 1 ; i < length ; i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }
        
        for (int i = 0 ; i < length ; i++){
            if((candies[i] + extraCandies) >= max){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        
        return result;
    }
}
