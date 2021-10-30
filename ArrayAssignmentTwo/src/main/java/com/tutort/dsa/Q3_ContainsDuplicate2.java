package com.tutort.dsa;

import java.util.*;

public class Q3_ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer , List<Integer>> hashMap = new HashMap<>();
        
        for(int i = 0 ; i < nums.length ; i++){
            if(hashMap.containsKey(nums[i])){
                List<Integer> arrList = hashMap.get(nums[i]);
                if(searchArrayList(arrList , k , i)){
                    return true;
                }else{
                    arrList.add(i);
                    hashMap.put(nums[i] , arrList);
                }
            }else{
                hashMap.put(nums[i] , new ArrayList<Integer>(Arrays.asList(i)));
            }
        }
        
        return false;
    }
    
    public boolean searchArrayList(List<Integer> arrList , Integer k , Integer n){
        for(int i = 0 ; i < arrList.size() ; i++){
            if(Math.abs(arrList.get(i) - n) <= k ){
                return true;
            } 
        }
        return false;
    }
}
