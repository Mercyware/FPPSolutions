package com.fpp.solutions;

public class GuthrieIndex {
    public int guthrieIndex(int n) {
        EvenNumbers evenNumbers = new EvenNumbers();
        int count = 0;

        while (n > 1) {
            if (evenNumbers.isEven(n)) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
            count++;
        }

        return count;
    }
}
