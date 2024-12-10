package com.dsa.leetcode.array_one;

import java.util.*;

public class SetMatrixZero {
    public void setZeroes(int[][] matrix) {

        Set<Integer> rows = new HashSet<>();
        Set<Integer> columns = new HashSet<>();
        int row, column;

        for(int i=0; i < matrix.length; i++){
            for(int j=0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    rows.add(i);
                    columns.add(j);
                }
            }
        }

        Iterator<Integer> i = rows.iterator();
        while(i.hasNext()){
            row = i.next();
            for(int k=0; k < matrix[0].length; k++)
                matrix[row][k] = 0;
        }

        Iterator<Integer> j = columns.iterator();
        while(j.hasNext()){
            column = j.next();
            for(int k=0; k < matrix.length; k++)
                matrix[k][column] = 0;
        }

    }
}
