package com.zwei.memory.methods;

public class Overloading {
    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1.5,1.5));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }
}
