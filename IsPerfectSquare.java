package com.fpp.solutions;

public class IsPerfectSquare {


    public boolean isPerfectSquare(int a) {
        boolean foundPerfect = false;
        // int nextPerfectSquare = 0;
        int sqrt = (int) (Math.sqrt(a));
        if (sqrt * sqrt == a) return true;
        return false;
    }
}



