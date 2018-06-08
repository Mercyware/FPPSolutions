package com.fpp.solutions;

public class PerfectSquare {
    Factors CheckFactor = new Factors();

    public int isPerfectSquare(int a) {
        boolean foundPerfect = false;
       // int nextPerfectSquare = 0;
        while (!foundPerfect) {
            a++;

            for (int i =0 ; i <= a; i++) {

                if (!CheckFactor.isFactor(a, i)) continue;

                if (i*i == a){
                    foundPerfect = true;
                    break;
                }
            }
        }
        return a;
    }
}
