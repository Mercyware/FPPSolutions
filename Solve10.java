package com.fpp.solutions;

public class Solve10 {
    public void solve10() {
        int xy[] = {0, 0};
        int x = 1;
        int y = 1;
        int factorialSum = 0;
        while (factorialSum != factorial(10)) {

            for (int i = 1; i <= x; i++) {
                factorialSum = factorial(x) + factorial(i);
                System.out.println(x + " x " + i +  "  = " + factorialSum);
                if (factorialSum == factorial(10)) {
                    y = i;
                    break;
                }

                x++;
            }


        }
        xy[0] = x;
        xy[1] = y;

        System.out.println(x);
        System.out.println(y);
       // return xy;
    }


    int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }
}
