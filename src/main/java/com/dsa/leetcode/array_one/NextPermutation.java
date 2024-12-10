package com.dsa.leetcode.array_one;

import java.util.*;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int breakPoint= -1;
        for(int i=nums.length-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                breakPoint = i;
                break;
            }
        }
        if(breakPoint != -1){
            nextP(nums, breakPoint);
        }
        else{
            Arrays.sort(nums);
        }
    }

    public void nextP(int[] nums, int breakPoint){
        int temp;
        for(int i=nums.length-1; i>=breakPoint; i--){
            if(nums[i] > nums[breakPoint]){
                temp = nums[i];
                nums[i] = nums[breakPoint];
                nums[breakPoint] = temp;
                break;
            }
        }
        Arrays.sort(nums, breakPoint+1, nums.length);
    }
}
