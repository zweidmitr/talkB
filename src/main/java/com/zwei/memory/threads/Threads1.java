package com.zwei.memory.threads;

public class Threads1 {
    public static void main(String[] args) {
        System.out.println("hello world - " + Thread.currentThread().getName());

        MyThread myThread = new MyThread(); // new
        myThread.start(); // ready

        MyThreadRunnable r1 = new MyThreadRunnable();
        Thread t2 = new Thread(r1);
        t2.start();

        System.out.println("Main thread is dead =)");
    }
}

class MyThread extends Thread {
    @Override
    public void run() { // Running
        for (int i = 0; i < 10; i++)
            System.out.println(i + " " + Thread.currentThread().getName());
    }
}

class MyThreadRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println(i + " " + Thread.currentThread().getName());
    }
}

