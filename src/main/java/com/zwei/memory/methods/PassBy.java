package com.zwei.memory.methods;

import com.zwei.memory.arrays.Outer;

import java.util.Arrays;

public class PassBy {
    public static void main(String[] args) {
        int x = 1;
        int[] arr = {5, 6, 7, 10, 15};

        check(x, arr);
        System.out.println("x is " + x);  // pass by value
        System.out.println(Arrays.toString(arr)); // pass by reference

        check(10, 20, 30, 40, 50);
    }

    private static void check(int... a) { // variable length argument list
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    private static void check(int x, int[] arr) {
        x = 100;
        arr[0] = 123;
        arr[1] = 456;
    }
}
