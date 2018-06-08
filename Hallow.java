package com.fpp.solutions;

public class Hallow {

    public int isHallow(int[] a) {
//Count preceding non zero
        int preceedingZero = 0;
        int zeros = 0;
        int lastZeros = 0;
        int i = 0;


        while (i < a.length && a[i] > 0) {
            preceedingZero++;
            i++;
        }

        while (i < a.length && a[i] == 0) {
            zeros++;
            i++;
        }

        while (i < a.length && a[i] > 0) {
            lastZeros++;
            i++;
        }


        if (preceedingZero != lastZeros || zeros < 3) {
            return 0;
        }

        return 1;
    }
}
