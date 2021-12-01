package com.tutort.dsa;

import java.util.*;

/**
 * 
 * https://leetcode.com/problems/pascals-triangle
 * Time Complexity : O(n^2) , need to find a solution with O(n)
 *
 */
public class Q4_PascalTriangle {
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        for(int i = 1; i <=numRows ; i++){
            if(i == 1){
                result.add(new ArrayList<Integer>(Arrays.asList(1)));
            }else if (i == 2){
                result.add(new ArrayList<Integer>(Arrays.asList(1 , 1)));
            }else {
                List<Integer> currentRow = new ArrayList<>();
                currentRow.add(1);
                currentRow.addAll(1 , getPrevRowSums(result.get(i - 2)));
                currentRow.add(1);
                result.add(currentRow);
            }
        }
        
        return result;
    }
    
    public List<Integer> getPrevRowSums(List<Integer> currentRow){
        List<Integer> result = new ArrayList<>(); 
        int length = currentRow.size();
        for(int i = 0 ; i < length - 1 ; i++){
            result.add(currentRow.get(i) + currentRow.get(i+1));
        }
        return result;
    }
}
