package com.dsa.leetcode.array_one;

import java.util.*;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int row=1; row<=numRows; row++){
            result.add(generateRow(row-1));
        }
        return result;
    }

    public List<Integer> generateRow(int row){
        List<Integer> resultRow = new ArrayList<>();
        int res = 1;

        resultRow.add(1);

        for(int i=0; i<row; i++){
            res = res * (row - i);
            res = res / (i + 1);
            resultRow.add(res);
        }
        return resultRow;
    }
}
