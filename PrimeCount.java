package com.fpp.solutions;

public class PrimeCount {
    Prime prime = new Prime();

    public int PrimeCount(int start, int end) {
        int primeCount = 0;
        for (int i = start; i<=end; i++){
           // System.out.println(prime.isPrime(i));
            if(prime.isPrime(i)){

                primeCount++;
            }

        }
        return primeCount;
    }
}
