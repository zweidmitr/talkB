package com.zwei.memory.recursion;

public class RecursionFibonacci {
    public static void main(String[] args) {
        // Fibonacci : 0 1 1 2 3 5 8 13 21 34 55 89 144 233
        System.out.println(fib(3)); // 2
        System.out.println(fib(8)); // 21
        System.out.println(fib(11)); // 89
        System.out.println(fib(31));
    }

    // memorization
    private static int fib(int n) {
        if (n == 1 || n == 0) return n; // Base step
        return fib(n - 1) + fib(n - 2);  // Recursion step
    }
}
