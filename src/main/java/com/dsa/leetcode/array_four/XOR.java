package com.dsa.leetcode.array_four;

import java.util.*;
public class XOR {
    public int solve(ArrayList<Integer> A, int B) {
        int  xR = 0, cnt = 0, x = 0;
        Map<Integer, Integer> xRMap = new HashMap<>();
        xRMap.put(xR, 1);
        for(int i=0; i< A.size(); i++){
            xR = xR ^ A.get(i);
            x = xR ^ B;
            if(xRMap.containsKey(x))
                cnt += xRMap.get(x);
            if(xRMap.containsKey(xR)){
                xRMap.put(xR, xRMap.get(xR) + 1);
            }
            else{
                xRMap.put(xR, 1);
            }
        }
        return cnt;
    }
}
