package com.dsa.leetcode.array_one;

public class KadaneAlgo {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE, sum = 0;
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
            if(sum < 0)
                sum = 0;
            if(sum > max)
                max = sum;
        }
        if(max == 0){
            max = Integer.MIN_VALUE;
            for(int i=0; i<nums.length; i++){
                if(nums[i] > max)
                    max = nums[i];
            }
        }
        return max;
    }
}
