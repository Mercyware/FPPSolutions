package com.fpp.solutions;

public class RaiseToPower {
    public int power(int n, int pow) {
        int result = 1;

        for (int i = 0; i < pow; i++) {

            result *= n;
        }
        return result;
    }
}
