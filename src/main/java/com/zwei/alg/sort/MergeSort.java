package com.zwei.alg.sort;

import java.sql.SQLOutput;
import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[100_000_000];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000_000);
        }

        System.out.print("Before: ");
//        printArray(numbers);

        mergeSort(numbers);

        System.out.print("\nAfter:  ");
//        printArray(numbers);
    }

    private static void mergeSort(int[] inputArray) {
        int inputLength = inputArray.length;

        if (inputLength < 2) {
            return;
        }

        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = inputArray[i];
        }
        for (int i = midIndex; i < inputLength; i++) {
            rightHalf[i - midIndex] = inputArray[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        // Merge
        merge(inputArray, leftHalf, rightHalf);
    }

    private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                inputArray[k++] = leftHalf[i++];
            } else {
                inputArray[k++] = rightHalf[j++];
            }
        }

        while (i < leftSize) {
            inputArray[k++] = leftHalf[i++];
        }

        while (j < rightSize) {
            inputArray[k++] = rightHalf[j++];
        }

    }

    public static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " - ");
        }
    }
}
