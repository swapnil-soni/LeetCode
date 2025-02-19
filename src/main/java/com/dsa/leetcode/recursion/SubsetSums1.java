package com.dsa.leetcode.recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubsetSums1 {

    public static void main(String[] args) {
        List<Integer> result = subsetSums(new int[]{2, 3});
        System.out.println(result);
    }

    public static ArrayList<Integer> subsetSums(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();

        subsetSum(arr, 0, 0, result);

        Collections.sort(result);
        return result;
    }

    public static void subsetSum(int[] arr, int index, int sum, ArrayList<Integer> result){
        if(index == arr.length){
            result.add(sum);
            return;
        }
        subsetSum(arr, index+1, sum+arr[index], result);
        subsetSum(arr, index+1, sum, result);
    }
}
