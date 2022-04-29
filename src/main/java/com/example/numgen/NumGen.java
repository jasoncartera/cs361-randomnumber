package com.example.numgen;
import java.util.Random;

public class NumGen {

    private int lower;
    private int upper;
    private int randNum;

    public NumGen(int lower, int upper) {
        this.lower = lower;
        this.upper = upper;
        this.randNum = this.GenRandom();
    }

    private int GenRandom() {
        Random rand = new Random();
        int random_int = rand.nextInt(this.upper - this.lower) + this.lower;
        return random_int;
    }

    public int getRandNum() {
        return this.randNum;
    }

}
