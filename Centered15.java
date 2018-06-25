package com.fpp.solutions;

public class Centered15 {
    public int isCentered15(int[] a) {
        int sum15 = 0;
        for (int i = 0; i < a.length; i++) {
            sum15 = 0;
            for (int j = 0; j < a.length-j; j++) {
                sum15 += a[j];
                if(sum15 == 15) return 1;
            }
        }

        return 0;
    }
}
