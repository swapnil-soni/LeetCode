package com.dsa.leetcode.array_three;

public class ReversePairs {
    public int reversePairs(int[] nums) {
        return mS(nums, 0, nums.length -1);
    }

    private int mS(int[] arr, int low, int high)
    {
        int count = 0;
        if(low >= high)
            return 0;

        int mid = (low + high) / 2;
        count += mS(arr, low, mid);
        count += mS(arr, mid + 1, high);
        count += countPairs(arr, low, mid, high);
        mergeAndCount(arr, low, mid, high);

        return count;
    }

    public int countPairs(int[] arr, int low, int mid, int high) {
        int right = mid + 1;
        int cnt = 0;
        for (int i = low; i <= mid; i++) {
            while (right <= high && arr[i] > 2 * arr[right])
                right++;
            cnt += (right - (mid + 1));
        }
        return cnt;
    }

    private int mergeAndCount(int[] arr, int low, int mid, int high)
    {
        int left = low, right = mid+1, temp = 0, swaps = 0, rt = 0;
        int[] resultArray = new int[(high - low) + 1];

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right])
                resultArray[temp++] = arr[left++];
            else {
                resultArray[temp++] = arr[right++];
            }
        }
        while (left <= mid)
            resultArray[temp++] = arr[left++];
        while (right <= high)
            resultArray[temp++] = arr[right++];

        for(int i=low; i<=high; i++){
            arr[i] = resultArray[i-low];
        }
        return swaps;
    }
}
