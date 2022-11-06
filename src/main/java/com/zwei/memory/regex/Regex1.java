package com.zwei.memory.regex;

public class Regex1 {
    public static void main(String[] args) {
        // *     -> от 0 до бесконечности
        // +     -> от 1 до бесконечности
        // ?     -> либо 0 либо 1
        // {n}   -> n раз
        // {n,}  -> минимум n раз и до бесконечности
        // {n,m} -> от n до m раз включительно

        String s = "sJavachjkgkghkjg";

        if (s.matches("[a-z]?Java.*"))
            System.out.println("YES");
        else System.out.println("NO");
    }
}
