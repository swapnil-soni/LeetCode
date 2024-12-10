package com.dsa.leetcode.array_two;

import java.util.*;

public class InversionProblem {
    public static long getInversions(long arr[], int n) {
        return mergeSort(arr, 0, n-1);
    }

    private static int mergeAndCount(long[] arr, int low, int mid, int high)
    {
        int left = low, right = mid+1, temp = 0, swaps = 0;
        long[] resultArray = new long[(high - low) + 1];

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right])
                resultArray[temp++] = arr[left++];
            else {
                swaps = swaps + (mid - left + 1);
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

    private static int mergeSort(long[] arr, int low, int high)
    {
        int count = 0;

        if (low < high) {
            int mid = (low + high) / 2;
            count += mergeSort(arr, low, mid);
            count += mergeSort(arr, mid + 1, high);
            count += mergeAndCount(arr, low, mid, high);
        }
        return count;
    }
}
