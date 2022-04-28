package com.atlinlin.exceptions;

/**
 * @ author : LiLin
 * @ create : 2022-04-13 19:05
 */
public class Exercise1 {

    public static void main(String[] args) {
        System.out.println("return value of getValue(): " + getValue());
    }

    public static int getValue() {
        int i = 1;
        try {
            i = 4;
        } finally {
            i = i++;
            return i;
        }
    }
}

