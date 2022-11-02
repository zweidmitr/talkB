package com.zwei.alg.sort;

import java.util.Random;

public class HeapSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10_000_000];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000_000);
        }

        System.out.print("Before: ");
        printArray(numbers);

        heapSort(numbers);

        System.out.print("\nAfter:  ");
        printArray(numbers);
    }

    private static void heapSort(int[] numbers) {
        int n = numbers.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(numbers, i, n);
        }

        for (int i = n - 1; i >= 0; i--) {
            int temp = numbers[i];
            numbers[i] = numbers[0];
            numbers[0] = temp;

            heapify(numbers, 0, i);
        }
    }

    private static void heapify(int[] numbers, int i, int n) {
        int l = i * 2 + 1;
        int r = i * 2 + 2;
        int largest = i;

        if (l < n && numbers[l] > numbers[largest]) {
            largest = l;
        }
        if (r < n && numbers[r] > numbers[largest]) {
            largest = r;
        }
        if (i != largest) {
            int temp = numbers[i];
            numbers[i] = numbers[largest];
            numbers[largest] = temp;

            heapify(numbers, largest, n);
        }
    }

    public static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " - ");
        }
    }
}
