package com.atlinlin.test;

import java.util.ArrayList;

/**
 * @ author : LiLin
 * @ create : 2022-04-25 22:24
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        System.out.println(l1.getClass() ==l2.getClass());
    }
}
