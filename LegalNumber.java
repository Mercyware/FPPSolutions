package com.fpp.solutions;

public class LegalNumber {
    public int isLegalNumber(int[] a, int base) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= base) return 0;
        }

        return 1;
    }
}
