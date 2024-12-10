package com.dsa.leetcode.strings_one;

public class Atoi {
    public int myAtoi(String s) {
        s = s.trim();

        if(s.length() == 0)
            return 0;

        long number = 0;
        int sign = 1, i = 0;

        if(s.charAt(i) == '-'){
            sign = -1;
            i++;
        }
        else if(s.charAt(i) == '+'){
            sign = 1;
            i++;
        }

        while(i < s.length() && number <= Integer.MAX_VALUE && Character.isDigit(s.charAt(i))){
            int n = s.charAt(i) - '0';
            number = number * 10 + n;
            i++;
        }
        number = Math.max(sign * number, Integer.MIN_VALUE);
        number = Math.min(number, Integer.MAX_VALUE);
        return (int) number;
    }
}
