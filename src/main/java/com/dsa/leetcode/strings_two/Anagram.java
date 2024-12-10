package com.dsa.leetcode.strings_two;

import java.util.*;
public class Anagram {
    public boolean isAnagram(String s, String t) {
        char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();

        Arrays.sort(sa);
        Arrays.sort(ta);

        String sr = new String(sa);
        String tr = new String(ta);

        if(sr.equals(tr))
            return true;
        else
            return false;
    }
}
