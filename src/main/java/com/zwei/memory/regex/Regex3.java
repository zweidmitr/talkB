package com.zwei.memory.regex;

public class Regex3 {
    public static void main(String[] args) {
        String s = "Jccva";
        // (a|b|c) - a или b или c
        if (s.matches("J(a|b|cc)va"))
            System.out.println("YES");
        else System.out.println("NO");

        // () - важен порядок
        String ss = "Jabcacbacbabc";
        if (s.matches("J(abc)+va"))
            System.out.println("YES");
        else System.out.println("NO");

        // [] множество, порядок не важен
        String sss = "Jcbaa";
        if (s.matches("J[abc]+va"))
            System.out.println("YES");
        else System.out.println("NO");
    }
}
