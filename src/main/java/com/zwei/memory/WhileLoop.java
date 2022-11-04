package com.zwei.memory;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            System.out.println("hello world: " + i);
            if (i++ == 2) break;
        }
        int x = 7;
        do {
            System.out.println("do while");
        } while (x < 5);

//        for (int j = 0; j >=0; j++) {
//            System.out.println("INFINITY");
//        }
        for (;;) {
            System.out.print("YES ");
        }
    }
}
