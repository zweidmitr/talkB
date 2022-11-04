package com.zwei.memory.arrays;

public class Outer {
    public static void main(String[] args) {
        int n = 5;
        outer:
        for (int i = 0; i < n; i++)
            for (int j = 0; j <= i; j++) {
                System.out.println(i + " " + j);
                if (j == 1) continue outer;
            }
    }
}
