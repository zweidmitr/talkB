package com.zwei.memory.recursion;

public class RecursionPodbor {
    public static void main(String[] args) {
        String s = "ABC";
        int n = 4;
        // AAAA AAAB AAAC AABA AABC... s.length() ^ n
        rec(s,n,"");
    }

    private static void rec(String s, int n, String curr) {
        // Base step
        if (curr.length() == n) {
            System.out.println(curr);
            return;
        }
        // Recursion step
        for (int i = 0; i < s.length(); i++) {
            rec(s,n, curr + s.charAt(i));
        }
    }
}
