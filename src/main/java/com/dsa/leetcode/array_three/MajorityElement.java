package com.dsa.leetcode.array_three;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int cnt = 0, temp= -1;
        for(int i=0; i<nums.length; i++){
            if(cnt == 0){
                temp = nums[i];
                cnt = 1;
            }
            else if(nums[i] == temp)
                cnt++;
            else
                cnt--;
        }
        return temp;
    }
}
