package com.fpp.solutions;

public class Inertial {
    EvenNumbers evenNumbers = new EvenNumbers();

    public int isInertial(int[] a) {
        int maximumEven = 0;
        boolean foundOdd = false;
        //Checking for Presense of odds
        for (int i = 0; i < a.length; i++) {
            if (!evenNumbers.isEven(a[i]))
                foundOdd = true;
        }

        if (!foundOdd) return 0;

        //Get The Highest values
        for (int i = 0; i < a.length; i++) {
            if (a[i] > maximumEven) maximumEven = a[i];
        }

        if (!evenNumbers.isEven(maximumEven)) return 0;

        //Checking that no even Number is greater than all
        for (int i = 0; i < a.length; i++) {
            if (evenNumbers.isEven(a[i])) // Only Select Odd Number Here, If Not Continue to the Next Number
                continue;

            for (int j = 0; j < a.length; j++) {
                if (!evenNumbers.isEven(a[j])) //We dont want to check agains other odds
                    continue;

                //Check that the selected odd number is greater every even except the maximum number
                if (a[j] < maximumEven && (a[i] <= a[j] || a[i] > maximumEven)) {
                    return 0;
                }
                //  return 2;


            }

        }
        return 1;
    }
}
