package com.zwei.memory.methods;

public class Practice {
    public static void main(String[] args) {
        System.out.println(sum(5, 3));
        System.out.println(sum(5, 3,2));
        System.out.println(sum(5, 3,"99"));
    }

    static int sum(int a, int b) {
        return a + b;
    }
    static int sum(int a, int b, int c) {
        return a + b + c;
    }
    static int sum(int a, int b, String c) {
        return a + b;
    }
}
