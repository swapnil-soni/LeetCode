package com.dsa.leetcode.array_two;

import java.util.*;

public class OverlapIntervals {
    public int[][] merge(int[][] intervals) {
        int start = -1, end = -1, j = -1, recentEnd = -1;
        int[][] result = new int[intervals.length][2];

        Arrays.sort(intervals, Comparator.comparingInt(x -> x[0]));

        for(int i=0; i<intervals.length; i++){
            start = intervals[i][0];
            end = intervals[i][1];
            if(start <= recentEnd){
                result[j][1] = Math.max(result[j][1], end);
                recentEnd = Math.max(recentEnd, end);
                continue;
            }
            else{
                ++j;
                result[j][0] = start;
                result[j][1] = end;

                recentEnd = end;
                continue;
            }
        }

        int[][] rs = new int[j+1][2];
        for(int i=0; i<=j; i++){
            if(!(result[i][0] == 0 && result[i][1] == 0))
                rs[i][0] = result[i][0];
            rs[i][1] = result[i][1];
        }

        return rs;

    }

}
