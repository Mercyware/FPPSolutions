package com.fpp.solutions;

public class NUnique {
    public int isNUnique(int[] a, int n) {
        int sum = 0;
        int countSum = 0;

        for (int i = 0; i < a.length; i++) {
            sum = 0;
            for (int j = i + 1; j < a.length; j++) {
                sum = a[i] + a[j];
                if (sum == n) countSum++;
                if (countSum > 1) return 0;
            }

        }
        if (countSum < 1) return 0;
        return 1;
    }
}
