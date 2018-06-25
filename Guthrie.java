package com.fpp.solutions;

public class Guthrie {
    public int isGuthrieSequence(int[] a) {
        EvenNumbers evenNumbers = new EvenNumbers();
        int newvalue = 0;
        if (a[a.length - 1] != 1) return 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (evenNumbers.isEven(a[i])) {
                newvalue = a[i] / 2;
            } else {
                newvalue = newvalue * 3 + 1;
            }

            if (newvalue != a[i + 1]) return 0;
        }
        return 1;
    }
}
