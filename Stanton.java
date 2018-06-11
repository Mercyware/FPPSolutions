package com.fpp.solutions;

public class Stanton {
    public int stantonMeasure(int[] a) {
        int count = 0;
        int numberExist = 0;
        for (int i = 0; i < a.length; i++) {

            {
                if (a[i] == 1) count++;

            }
        }
        for (int j = 0; j < a.length; j++) {

            if (a[j] == count) numberExist++;


        }
        return numberExist;
    }
}