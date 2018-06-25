package com.fpp.solutions;

public class HasZeros {

    public int arrayHasNoZeroes(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                return 0;
            }
        }
        return 1;
    }
}
