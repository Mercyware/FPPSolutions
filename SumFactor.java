package com.fpp.solutions;

public class SumFactor {
    public int sumFactor(int[] a) {
        int sum = 0;
        int countSum = 0;

        //Sum Up the Array
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        //Check the number of times Sum existed in the array
        for (int i = 0; i <a.length ; i++) {
           if (a[i]==sum) countSum++;
        }

        return countSum;
    }
}
