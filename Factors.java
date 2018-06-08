package com.fpp.solutions;

public class Factors {

    //Check if a Number is a factor of a given number
    public boolean isFactor(int number, int factor) {

        return number == 1 || number % factor == 0;

    }
}
