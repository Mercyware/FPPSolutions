package com.fpp.solutions;

public class CountSquare {


    public int CountSquarePairs(int[] a) {
        IsPerfectSquare isPerfectSquare = new IsPerfectSquare();
        int countPairs = 0;
        int sumPairs;
        for (int i = 0; i < a.length; i++) {
            sumPairs = 0;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] <= 0 || a[j] <= 0) continue;
                sumPairs = a[i] + a[j];

                if (isPerfectSquare.isPerfectSquare(sumPairs)) countPairs++;
            }
        }
        return countPairs;
    }
}
