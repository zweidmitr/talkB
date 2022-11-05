package com.zwei.memory.recursion;

public class RecursionPalindrome {
    public static void main(String[] args) {
        String s = "HANNAH";
        System.out.println(isPalindrome(s) ? "YES" : "NO");
        System.out.println(isPalindrome("DIMA") ? "YES" : "NO");
        System.out.println(isPalindrome("KAYAK") ? "YES" : "NO");
    }

    private static boolean isPalindrome(String s) {
        if (s.length() == 1 || s.length() == 0)
            return true;                                          // Base step
        if (s.charAt(0) == s.charAt(s.length() - 1))
            return isPalindrome(s.substring(1, s.length() - 1));  // Recursion step
        return false;
    }
}
