package com.atlinlin.thread;

/**
 * @ author : LiLin
 * @ create : 2022-04-23 9:37
 */
public class myThread extends Thread{
    public static void main(String[] args) {
        myThread t=new myThread();
        myThread s=new myThread();
        t.start();
        System.out.println("one.");
        s.start();
        System.out.println("two.");
    }
    public void run() {
        System.out.println("Thread");
    }
}