package com.zwei.memory.threads;

public class Threads2 {
    public static void main(String[] args) throws InterruptedException {
        MyaThread1 myaThread = new MyaThread1();

        Thread t1 =  new Thread(myaThread);
        t1.start();

        Thread t2 =  new Thread(myaThread);
        t2.start();

        Thread.sleep(1000);
        System.out.println(myaThread.getX());
    }
}

class MyaThread1 extends Thread {
    int x = 0;

    @Override
    public synchronized void run() {
        for (int i = 0; i < 10_000; i++) {
            int temp = x;
            temp++;
            x = temp;
        }
    }

    public int getX() {
        return x;
    }
}
