package com.fpp.solutions;

public class NUpCount {
    public int nUpCount(int[] a, int n) {
        int sum = 0;
        int previousSum = 0;
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (sum > n && previousSum <= n) {
                count++;
            }

            previousSum = sum;
        }
        return count;
    }
}
