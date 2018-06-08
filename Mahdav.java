package com.fpp.solutions;

public class Mahdav {
    public void isMadhavArray(int[] a) {
        int sum;
        int end = 0;
        int counter = 2;

        for (int i = 2; i < a.length; i += counter) {
            sum = 0;
            for (int j = i; j > end; j--) {

                sum = sum + a[j];


            }
            System.out.println(sum);
            end = i;
            counter++;
        }
    }
}
