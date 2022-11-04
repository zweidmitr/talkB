package com.zwei.memory.methods;

public class StaticLocalVariable {
    static int y = 12;

    public static void main(String[] args) {
        int x = 5;
        System.out.println(x);
        x = 7;
        System.out.println(x);

        int y = 10;
        System.out.println(y);
        System.out.println(StaticLocalVariable.y);
        System.out.println(str);
        System.out.println(max(7, 3));

    }

    static String str = "hello";

    public static int max(int a, int b) {
        if (a > b) return a;

        System.out.println("OK");
        return b;
    }
}
