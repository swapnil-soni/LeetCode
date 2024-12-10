package com.dsa.leetcode.array_two;

import java.util.*;

public class FindDuplicate {
    public int findDuplicate(int[] nums) {

        Map<Integer, Integer> numCount = new HashMap<>();
        int flag = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            if(numCount.containsKey(nums[i]))
                return nums[i];
            else
                numCount.put(nums[i], 1);
        }

        return flag;
    }
}
