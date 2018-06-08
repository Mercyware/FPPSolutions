package com.fpp.solutions;

public class UpCount {
    public int isUpCount(int[] a, int n) {
        int sum = 0;
        int previousSum = 0;
        int count = 0;

        for (int number : a) {
            sum = sum + number;

            if (previousSum <= n && sum > n) {
                count++;
            }
            previousSum = sum;
        }

        return count;
    }
}
