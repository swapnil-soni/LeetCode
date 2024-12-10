package com.dsa.leetcode.array_four;

import java.util.*;

public class ConsecutiveIntegers {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();
        int count = 0, largest =0, num;

        for(int i=0; i<nums.length; i++){
            s.add(nums[i]);
        }

        for(int i=0; i<nums.length; i++){
            num = nums[i];
            if(s.contains(num-1))
                continue;
            else if(!s.contains(num-1)){
                count=1;
                num = num + 1;
                while(s.contains(num)){
                    count++;
                    num = num + 1;
                }
                if(count>largest)
                    largest = count;
            }
        }

        return largest;

    }
}
