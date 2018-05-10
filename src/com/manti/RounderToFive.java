package com.manti;

public class RounderToFive {
    private static final int NUMBER = 5;
    public float round(float a){
        return Math.round(a/NUMBER) * NUMBER;
    }
}
