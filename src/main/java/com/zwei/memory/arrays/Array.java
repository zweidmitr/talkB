package com.zwei.memory.arrays;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 5;
        arr[1] = 7;
        arr[2] = 11;
        System.out.println(Arrays.toString(arr) + "\n");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int array[] = new int[31];
        array[0] = 1;
        for (int i = 1; i < 31; i++) {
            array[i] = array[i - 1] * 2;
        }
        System.out.println(Arrays.toString(array));

        int[] arrayPlus = {21, 3, 17, 9, 7, 5}; // array initializer
        System.out.println(Arrays.toString(arrayPlus));

        String[] months = {"January", "February", "March"};
        System.out.println(Arrays.toString(months));

    }
}
