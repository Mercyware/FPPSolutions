package com.fpp.solutions;

public class PorcupineNumber {

    public int findPorcupineNumber(int n) {
        Prime prime = new Prime();
        boolean foundPorcupineNumber = false;
        int firstPrime = 0;

        while (!foundPorcupineNumber) {
            n++;
          //  System.out.println(n);
            if (prime.isPrime(n)) {
                //This is a Prime Number
                //Check if it is a PorcupineNumber
                if (n % 10 == 9) {

                    firstPrime = n;
                    boolean foundNextPrime = false;

//Find the Next Prime
                    do {
                        firstPrime++;
                        if (prime.isPrime(firstPrime)) {

                            if (firstPrime % 10 == 9) {

                                foundPorcupineNumber = true;
                            }

                            foundNextPrime = true;

                        }
                    } while (!foundNextPrime);
                }


            }


        }

        return n;
    }
}
