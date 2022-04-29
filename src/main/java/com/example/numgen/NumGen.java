package com.example.numgen;
import java.lang.Math;

public class NumGen {

    private int lower;
    private int upper;
    private int randNum;

    public NumGen(int lower, int upper) {
        this.lower = lower;
        this.upper = upper;
        this.randNum = this.GenRandom();
    }

    public int GenRandom() {
        int random_int = (int)Math.floor(Math.random()*(this.upper-this.lower+1)+this.lower);
        return random_int;
    }

    public int getRandNum() {
        return this.randNum;
    }

}
