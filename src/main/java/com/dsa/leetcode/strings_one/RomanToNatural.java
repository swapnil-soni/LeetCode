package com.dsa.leetcode.strings_one;

import java.util.*;

public class RomanToNatural {
    public int romanToInt(String s) {
        int sum = 0;
        Map<Character, Integer> roMap = new HashMap<>();
        roMap.put('I', 1);
        roMap.put('V', 5);
        roMap.put('X', 10);
        roMap.put('L', 50);
        roMap.put('C', 100);
        roMap.put('D', 500);
        roMap.put('M', 1000);

        for(int i=0; i<s.length(); i++){
            if(i+1 <= s.length()-1 && roMap.get(s.charAt(i)) < roMap.get(s.charAt(i+1))){
                sum -= roMap.get(s.charAt(i));
            }
            else{
                sum += roMap.get(s.charAt(i));
            }
        }
        return sum;
    }
}
