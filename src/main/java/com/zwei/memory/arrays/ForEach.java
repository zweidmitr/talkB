package com.zwei.memory.arrays;

public class ForEach {
    public static void main(String[] args) {
        int arr[] = new int[30];
        arr[0] = 9;
        arr[29] = 1;
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        System.out.println();

        for (int value : arr)
            System.out.print(value + " ");

        System.out.println();

        int[][] matrixExample = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9},
                {10, 11, 12},
                {13, 14},
                {15}
        };

        for (int[] array : matrixExample) {
            for (int value : array)
                System.out.print(value + " ");
            System.out.println();
        }
    }
}
