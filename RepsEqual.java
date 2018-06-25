package com.fpp.solutions;

public class RepsEqual {
    public int repsEqual(int a[], int n) {
        int divisor = 10;
        for (int i = a.length - 1; i >= 0; i--) {

            if (a[i] != n % 10) {
                return 0;
            }
            n = n / 10;
        }
        return 1;
    }
}
