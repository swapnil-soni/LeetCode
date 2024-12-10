package com.dsa.leetcode.array_three;

public class Pow {
    public double myPow(double x, int n) {
        long pow = n;
        double ans = 1.0;

        if(pow < 0)
            pow = -1 * pow;

        while(pow > 0){
            if(pow % 2 == 1){
                ans = ans * x;
                pow--;
            }
            if(pow % 2 == 0){
                x = x * x;
                pow = pow / 2;
            }
        }
        if(n < 0)
            ans = (double) 1/ (double) ans;

        return ans;
    }
}
