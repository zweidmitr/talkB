package com.zwei.memory.meth;

public class StringMet2 {
    public static void main(String[] args) {
        String s = "Welcome to Java";
        String t = "welcome to Java";
        String r = "Welcome to Java";

        if (s.equals(t)) System.out.println("YES");
        else System.out.println("NO");

        if (s.equalsIgnoreCase(t)) System.out.println("YES");
        else System.out.println("NO");

        char c = 'W';
        char d = 'w';
        System.out.println((int) c); // alt code
        System.out.println((int) d); // alt code

        System.out.println(s.compareTo(r));

        System.out.println(s.startsWith("We"));
        System.out.println(t.startsWith("We"));
        System.out.println(s.endsWith("Java"));
    }
}
