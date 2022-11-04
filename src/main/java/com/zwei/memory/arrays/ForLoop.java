package com.zwei.memory.arrays;

public class ForLoop {
    public static void main(String[] args) {
        int count = 5;
        for (int i = 0; i < 7; i++) {
            if (i == count) continue;
            System.out.println(i + " works");
        }
    }
}
