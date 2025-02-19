package com.dsa.leetcode.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Subsets2 {
    public static void main(String[] args) {
        System.out.println(subsetsWithDup(new int[]{1, 2, 3}));
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans =new ArrayList<>();
        findsubset(nums,ans,0,new ArrayList<>());
        return ans;
    }

    private static void findsubset(int[] arr,List<List<Integer>> ans,int ind,List<Integer> subset){
        ans.add(new ArrayList<>(subset));
        for(int i=ind;i<arr.length;i++){
            if(i!=ind && arr[i]==arr[i-1]) continue;
            subset.add(arr[i]);
            findsubset(arr,ans,i+1,subset);
            subset.remove(subset.size()-1);
        }
    }
}
