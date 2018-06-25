package com.fpp.solutions;

public class Solve10 {
    public int[] solve10() {
        int xy[] = {0, 0};
        int x = 1;
        int y = 1;
        int factorialSum = 0;

       // System.out.println(factorial(34));
        while (factorialSum != factorial(10)) {
            x++;
            for (int i = 1; i <= x; i++) {
                factorialSum = factorial(x) + factorial(i);
             //   System.out.println(x + "-" + factorial(x) + " + " + i + "-" + +factorial(i) + "  = " + factorialSum);
                if (factorialSum == factorial(10)) {
                    y = i;
                    xy[0] = x;
                    xy[1] = y;
                    break;
                }


            }


        }


        return xy;
    }


    int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }
}
