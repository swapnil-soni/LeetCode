package com.dsa.leetcode.array_one;

public class StockMaxProfit {
    public int maxProfit(int[] prices) {
        int min = prices[0], profit = 0, cost = 0;
        for(int i=1; i<prices.length; i++){
            cost = prices[i] - min;
            profit = profit > cost ? profit : cost;
            min = min < prices[i] ? min : prices[i];
        }
        return profit;
    }
}
