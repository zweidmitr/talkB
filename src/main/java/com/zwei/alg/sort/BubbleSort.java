package com.zwei.alg.sort;

import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {

        Random rand = new Random();
        int[] numbers = new int[1000_000];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100_000);
        }
        System.out.print("Before: ");
        printArray(numbers);

        // zwei
        for (int q = 0; q < numbers.length-1; q++) {
            for (int i = 1; i < numbers.length; i++) {
                int temp = numbers[i];
                if (numbers[i - 1] > numbers[i]) {
                    numbers[i] = numbers[i - 1];
                    numbers[i - 1] = temp;
                }
            }
        }

//        // youtube
//        boolean swappedSomething = true;
//        while (swappedSomething) {
//            swappedSomething = false;
//
//            for (int i = 0; i < numbers.length - 1; i++) {
//                if (numbers[i] > numbers[i + 1]) {
//                    swappedSomething = true;
//                    int temp = numbers[i];
//                    numbers[i] = numbers[i + 1];
//                    numbers[i + 1] = temp;
//                }
//            }
//        }

        System.out.print("\nAfter:  ");
        printArray(numbers);

    }

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " - ");
        }
    }
}
