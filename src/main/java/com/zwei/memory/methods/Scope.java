package com.zwei.memory.methods;

public class Scope {
    static int a = 555;
    int b = 10;

    public static void main(String[] args) {
        // Scope of variables
        int x = 7;
        System.out.println(x);
        System.out.println(a);

        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
//        System.out.println(i);
        System.out.println();

        int i;
        for (i = 0; i < 7; i++) {
            System.out.print(i + " ");
        }
                System.out.println(i);
    }

    public void checkB() {
        System.out.println(b);
    }

    public static void print() {
//        System.out.println(x);
    }
}
