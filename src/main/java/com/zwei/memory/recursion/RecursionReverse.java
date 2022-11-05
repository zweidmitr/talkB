package com.zwei.memory.recursion;

public class RecursionReverse {
    public static void main(String[] args) {
        String s = "apple"; // elppa
        System.out.println(reverse(s));
        System.out.println(reverse("abcd"));
    }

    private static String reverse(String s) {
        if (s.length() == 1) return s;                                                  // Base step
        return "" + s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1)); // Recursion step
    }
}
