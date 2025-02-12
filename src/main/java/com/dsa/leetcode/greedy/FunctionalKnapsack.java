package com.dsa.leetcode.greedy;

import java.util.*;

public class FunctionalKnapsack {
    public static void main(String[] args) {
        int[] val = new int[]{60, 100, 120};
        int[] wt = new int[]{10, 20, 30};
        List<Integer> val1 = Arrays.stream(val).boxed().toList();
        List<Integer> wt1 = Arrays.stream(wt).boxed().toList();
        int capacity = 50;
        System.out.println("Maximum Value: " + fractionalKnapsack(val1, wt1, capacity));
    }

    static double fractionalKnapsack(List<Integer> val, List<Integer> wt, int capacity) {
        List<Item> items = new ArrayList<>();
        int currWt = capacity, j = 0;
        double profit = 0;

        for(int i=0; i<val.size(); i++){
            items.add(new Item(val.get(i), wt.get(i), (double)val.get(i)/wt.get(i)));
        }

        Collections.sort(items, new Comparator<Item>(){
            @Override
            public int compare(Item i1, Item i2){
                return Double.compare(i2.ratio, i1.ratio);
            }
        });

        while(currWt > 0 && j<items.size()){
            if(items.get(j).wt <= currWt){
                profit += items.get(j).val;
                currWt -= items.get(j).wt;
            }
            else{
                profit += items.get(j).ratio * currWt;
                currWt = 0;
                break;
            }
            j++;
        }
        return profit;
    }
}

class Item{
    public int val;
    public int wt;
    public double ratio;

    public Item(int val, int wt, double ratio){
        this.val = val;
        this.wt = wt;
        this.ratio = ratio;
    }
}
