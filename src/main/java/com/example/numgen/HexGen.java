package com.example.numgen;

import java.util.Random;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HexGen {

    private char[] array = new char[64];
    private String randString = this.genString();

    private String genString() {
        String values = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random rand = new Random();
        for (int i = 0; i < 64; i++) {
            int random_int = rand.nextInt(values.length());
            array[i] = values.charAt(random_int);
        }
        String out = new String(array);
        return out;
    }

    private String hashString(String input) {
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("MD5");

            byte[] MessageDigest = md.digest(input.getBytes());
            BigInteger no = new BigInteger(1, MessageDigest);
            String hashText = no.toString(16);
            while (hashText.length() < 32) {
                hashText = "0" + hashText;
            }
            return hashText;
        }
        // For specifying wrong message digest algorithms
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public String getRandString() {
        return this.randString;
    }

    public String getHex() {
        return hashString(this.randString);
    }
}
