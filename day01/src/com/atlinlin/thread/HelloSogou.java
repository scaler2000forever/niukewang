package com.atlinlin.thread;

/**
 * @ author : LiLin
 * @ create : 2022-04-20 23:17
 */
public class HelloSogou{
    public static synchronized void main(String[] a){
        Thread t= new Thread(() -> Sogou());
        t.start();
        System.out.print("Hello");
    }
    static synchronized void Sogou(){
        System.out.print("Sogou");
    }
}