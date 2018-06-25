package com.fpp.solutions;

public class IsSquare {

    public int isSquare(int n) {

        for (int i = 0; i < n; i++) {
            if (i * i == n) return 1;
        }
        return 0;
    }
}
