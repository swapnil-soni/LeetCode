package com.dsa.leetcode.array_four;

import java.util.*;

public class LargestSubArray {
    int maxLen(int arr[], int n)
    {
        HashMap<Integer, Integer> mpp = new HashMap<>();

        int maxi = 0;
        int sum = 0;

        for(int i = 0;i<n;i++) {
            sum += arr[i];
            if(sum == 0) {
                maxi = i + 1;
            }
            else {
                if(mpp.get(sum) != null) {
                    maxi = Math.max(maxi, i - mpp.get(sum));
                }
                else {
                    mpp.put(sum, i);
                }
            }
        }
        return maxi;
    }
}
