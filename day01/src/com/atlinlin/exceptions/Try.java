package com.atlinlin.exceptions;

/**
 * @ author : LiLin
 * @ create : 2022-04-26 22:14
 */
public class Try {
        public static void main(String[] args) {
            System.out.println(test());

        }
        private static int test() {
            int temp = 1;
            try {
                System.out.println(temp);
                return ++temp;
            } catch (Exception e) {
                System.out.println(temp);
                return ++temp;
            } finally {
                ++temp;
                System.out.println(temp);
            }
        }
    }

