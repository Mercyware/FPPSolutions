package com.fpp.solutions;

public class PefectNumber {
    public int henry(int i, int j) {
        Boolean foundPefect = false;
        int start = 0;
        int perfectSqaure = 0;

        int firstPerfect = 0;
        int lastPerfect = 0;
        int counter = 1;

        while (counter <= j) {
            perfectSqaure = 0;
            start++;

            for (int k = 1; k < start; k++) {
                //Check If It is A factor
                if (start % k == 0) {

                    perfectSqaure += k;
                }
            }


            if (perfectSqaure == start) {


                if (counter == i) {
                    firstPerfect = start;
                }

                if (counter == j) {
                    lastPerfect = start;
                }

                counter++;

            }


        }

        return firstPerfect + lastPerfect;
    }
}
