package com.dsa.leetcode.array_four;

import java.util.*;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> uniChar = new HashMap<>();
        int l=0, r=0, length = 0;
        while(r < s.length()){
            if(uniChar.containsKey(s.charAt(r)))
                l = Math.max(uniChar.get(s.charAt(r)) + 1, l);
            uniChar.put(s.charAt(r), r);
            length = Math.max(r-l+1, length);
            r++;
        }
        return length;
    }
}
