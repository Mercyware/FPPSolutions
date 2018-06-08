package com.fpp.solutions;

public class Prime {

    public boolean isPrime(int a) {
     if (a <= 1) return false;

        for (int i = 2; i < a; i++) {

            if (a % i == 0) {
               return false;
            } // Prime Factors can only be 1 and itself

        }
        return true;
    }
}
