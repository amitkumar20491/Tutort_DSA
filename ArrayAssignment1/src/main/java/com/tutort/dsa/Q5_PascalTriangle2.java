package com.tutort.dsa;

import java.util.*;

/**
 * 
 * https://leetcode.com/problems/pascals-triangle-ii/
 * Time Complexity : O(n^2) , need to find a solution with O(n)
 *
 */
public class Q5_PascalTriangle2 {
	public List<Integer> getRow(int rowIndex) {
		List<Integer> result = new ArrayList<Integer>();

		for(int i = 0; i <= rowIndex ; i++){
			if(i == 0){
                result = new ArrayList<Integer>(Arrays.asList(1));
            }else if (i == 1){
                result = new ArrayList<Integer>(Arrays.asList(1 , 1));
            }else {
            	List<Integer> prevRow = new ArrayList<Integer>();
            	prevRow.addAll(result);
            	result = new ArrayList<Integer>(Arrays.asList(1 , 1));
            	result.addAll(1, getPrevRowSums(prevRow));
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
