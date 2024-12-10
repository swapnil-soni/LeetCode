package com.dsa.leetcode.strings_one;

public class ReverseWords {
    public String reverseWords(String s) {
        String[] sa = s.trim().split("\\s+");
        StringBuffer sb = new StringBuffer();

        for(int i=sa.length-1; i>=0; i--){
            sb.append(sa[i] + " ");
        }

        return sb.toString().trim();

    }
}
