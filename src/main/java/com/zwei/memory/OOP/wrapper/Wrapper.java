package com.zwei.memory.OOP.wrapper;

public class Wrapper {
    public static void main(String[] args) {
        int x = 5;
        Integer xx = 10;

        System.out.println(x);
        System.out.println(xx);

        int y = xx;
        System.out.println("y " + y);

        Integer yy = (Integer) x;
        System.out.println("yy " + y);

    }
}
