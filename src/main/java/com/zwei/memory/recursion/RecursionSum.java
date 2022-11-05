package com.zwei.memory.recursion;

public class RecursionSum {
    public static void main(String[] args) {
        System.out.println(sum(10));
    }

    public static int sum(int n) {
        if (n == 1) return 1;      // base step
        return n + sum(n - 1);  // recursion step  10 + sum(9) = 9 + sum(8) = 8 + sum(7)....
        // 10 + 9 + 8 + 7 + 6 + 5 + 4 + sum(3) = 6
    }
}
