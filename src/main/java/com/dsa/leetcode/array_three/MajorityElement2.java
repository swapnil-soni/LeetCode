package com.dsa.leetcode.array_three;

import java.util.*;

public class MajorityElement2 {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1 = 0, cnt2 = 0, ele1 = Integer.MIN_VALUE, ele2 = Integer.MIN_VALUE;
        List<Integer> result = new ArrayList<>();
        int minOccur = (nums.length/3) + 1;

        for(int i=0; i<nums.length; i++){
            if(cnt1 == 0 && nums[i] != ele2){
                ele1 = nums[i];
                cnt1 = 1;
            }
            else if(cnt2 == 0 && nums[i] != ele1){
                ele2 = nums[i];
                cnt2 = 1;
            }
            else if(nums[i] == ele1){
                cnt1++;
            }
            else if(nums[i] == ele2){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }

        cnt1 = 0;
        cnt2 = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == ele1)
                cnt1++;
            else if(nums[i] == ele2)
                cnt2++;
        }

        if(cnt1 >= minOccur)
            result.add(ele1);
        if(cnt2 >= minOccur)
            result.add(ele2);

        return result;
    }
}
