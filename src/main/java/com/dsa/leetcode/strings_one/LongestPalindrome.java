package com.dsa.leetcode.strings_one;

public class LongestPalindrome {
    public String longestPalindrome(String s) {
        if(s.length() <= 1)
            return s;

        String maxStr = s.substring(0,1);

        for(int i=0; i<s.length()-1; i++){
            String even = expandFromMiddle(s, i, i+1);
            String odd = expandFromMiddle(s, i, i);
            if(even.length() > maxStr.length()){
                maxStr = even;
            }
            if(odd.length() > maxStr.length()){
                maxStr = odd;
            }
        }
        return maxStr;
    }

    public String expandFromMiddle(String s, int i, int j){
        while(i>=0 && j<s.length() && s.charAt(i) == s.charAt(j)){
            i--;j++;
        }
        return s.substring(i+1, j);
    }
}
