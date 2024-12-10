package com.dsa.leetcode.array_three;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] memory = new int[m][n];
        return countPaths(memory, 0, 0, m, n);
    }

    public int countPaths(int[][] memory, int i, int j, int n, int m){
        if(i == n-1 && j == m-1)
            return 1;
        else if(i >= n || j >= m)
            return 0;
        else{
            if(memory[i][j] != 0)
                return memory[i][j];
            else
                return memory[i][j] = countPaths(memory, i+1, j, n, m)
                        + countPaths(memory, i, j+1, n, m);
        }

    }
}
