package com.fpp.solutions;

public class Madhav2 {
    public int isMadhavArray(int[] a) {

        int end = 0;
        int counter = 2;

        for (int i = 2; i < a.length; i += counter) {
            int sum = 0;
            for (int j = i; j > end; j--) {
                sum += a[j];
            }

            if (sum != a[0]) return 0;

            end = i;
            counter++;

        }

        return 1;
    }
}
