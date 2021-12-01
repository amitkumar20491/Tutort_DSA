package com.tutort.dsa;

/*
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii
 */
public class Q7_MaxProfit2 {
	public int maxProfit(int[] prices) {
        int length = prices.length;
        int maxProfit = 0;
        
        for (int i = length - 1 ; i > 0 ; i--){
           if(prices[i] > prices[i-1]){
               maxProfit = maxProfit + (prices[i] - prices[i-1]);
           }
        }
        
        return maxProfit; 
    }
}
