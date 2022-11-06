package com.zwei.memory.OOP.wrapper;

public class Parse_vs_ValueOf {
    public static void main(String[] args) {
        // возвращает int
        int x = Integer.parseInt("123");

        // возвращает объект
        Integer xx = Integer.valueOf("123");
        Integer xxx = Integer.valueOf(123);

        System.out.println(x);
        System.out.println(xx);
        System.out.println(xxx);
    }
}
