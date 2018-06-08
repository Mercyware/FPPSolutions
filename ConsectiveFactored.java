package com.fpp.solutions;

public class ConsectiveFactored {
    Factors CheckFactor = new Factors();

    public int isConsectiveFactored(int a) {

        int lastfactor = 0;
        //Get the Factors of the Number
        for (int i = 2; i < a; i++) {
            if (CheckFactor.isFactor(a, i)){
                //The Number is a factore


                //Check if it is Consecutive
                if (lastfactor + 1 == i) {
                    return 1;
                }
            lastfactor = i;

        }
    }
        return 0;
}
}
