package com.dsa.leetcode.array_two;

public class RotateMatrix {
    public void rotate(int[][] matrix) {
        int temp;
        for(int i=0; i<matrix.length - 1; i++){
            for(int j=i+1; j<matrix.length; j++){
                temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
        for(int i=0; i<matrix.length; i++){
            reverseRow(matrix[i]);
        }
    }

    public void reverseRow(int[] row){
        int left=0, right = row.length -1, temp;
        while(left < right){
            temp = row[left];
            row[left] = row[right];
            row[right] = temp;
            left++;
            right--;
        }
    }
}
