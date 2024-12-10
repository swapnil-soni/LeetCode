package com.dsa.leetcode.array_three;

public class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length, m = matrix[0].length;
        int low = 0, high = m*n-1, row, column, mid;

        while(low <= high){
            mid = (low + high)/2;
            row = mid / m;
            column = mid % m;
            if(matrix[row][column] == target)
                return true;
            else if(matrix[row][column] < target)
                low = mid + 1;
            else if(matrix[row][column] > target)
                high = mid - 1;
        }

        return false;
    }
}
