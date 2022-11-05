package com.zwei.memory.recursion;

public class RecursionFactorial {
    public static void main(String[] args) {
        // n!
        System.out.println(factorial(4));
    }

    private static int factorial(int n) {
        if (n == 1) return 1;            // Base step
        return n * factorial(n - 1);   // Recursion step
    }
}
