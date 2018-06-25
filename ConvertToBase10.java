package com.fpp.solutions;

public class ConvertToBase10 {
    LegalNumber legalNumber = new LegalNumber();
    RaiseToPower raiseToPower = new RaiseToPower();

    public int convertToBase10(int[] a, int base) {
        int sum = 0;
        int count = 1;
        //Checking that the Number is Legal
        if (legalNumber.isLegalNumber(a, base) == 0) return -1;

        for (int i = 0; i < a.length; i++) {
        //    System.out.println( raiseToPower.power(base, a.length - count));
            sum += (a[i] * raiseToPower.power(base, a.length - count));
            count++;
        }

        return sum;
    }
}
