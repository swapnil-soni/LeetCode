package com.dsa.leetcode.array_two;

import java.util.*;

public class FindMissingAndRepeating {
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        int n = A.size();
        ArrayList<Integer> resultPair = new ArrayList<>();

        long sn = (long) (n * (n+1))/2;
        long s2n = (long) (n * (n+1) * (2*n+1))/6;
        long s = 0, s2 = 0;

        for(int i=0; i<n; i++){
            s = s + A.get(i);
            s2 = (long) s2 + (A.get(i) * A.get(i));
        }

        long eq1 = s - sn;
        long eq2 = s2 - s2n;
        eq2 = eq2 / eq1;

        int x = (int) (eq1 + eq2) / 2;
        int y = (int) (x - eq1);

        resultPair.add(x);
        resultPair.add(y);

        return resultPair;
    }
}
