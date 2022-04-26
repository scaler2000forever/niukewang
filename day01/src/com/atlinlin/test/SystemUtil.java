package com.atlinlin.test;

/**
 * @ author : LiLin
 * @ create : 2022-04-15 23:50
 */
public class SystemUtil {

    public static boolean isAdmin(String userId) {
        return userId.toLowerCase() == "admin";
    }

    public static void main(String[] args) {
        System.out.println(isAdmin("Admin"));
    }

}
