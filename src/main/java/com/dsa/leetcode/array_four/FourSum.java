package com.dsa.leetcode.array_four;

import java.util.*;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> rs = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1])
                continue;
            for(int j=i+1; j<nums.length; j++){
                if(j > i+1 && nums[j] == nums[j-1])
                    continue;
                int k = j+1, l = nums.length-1;
                while(k<l){
                    long sum = nums[i] + nums[j];
                    sum += nums[k];
                    sum += nums[l];
                    if(sum == target){
                        rs.add(List.of(nums[i], nums[j], nums[k], nums[l]));
                        k++; l--;
                        while(k<l && nums[k] == nums[k-1])
                            k++;
                        while(k<l && nums[l] == nums[l+1])
                            l--;
                    }
                    else if(sum > target)
                        l--;
                    else
                        k++;
                }
            }
        }
        return rs;
    }
}
