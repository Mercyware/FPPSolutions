package com.fpp.solutions;

public class Millage {
    public void updateMillage(int[] meters, int miles) {
        int mileEnd =0;
        for (int meter : meters) {
            for (int mile = mileEnd; mile < miles; mile++)
                if (meter < 9) {
                    meter++;
                    mileEnd++;
                } else {

                    meter = 0;
                }

            System.out.println(meter);

        }

    }
}
