package com.zwei.memory.regex;

public class Regex4 {
    public static void main(String[] args) {
        String s = "Java";
        // ^Java - начинается с Java
        if (s.matches("^Java.*"))
            System.out.println("YES");
        else System.out.println("NO");

        String ss = "JavaTheBestScript";
        // $Script - заканчивается на $Script
        if (ss.matches("^Java.*Script$"))
            System.out.println("YES");
        else System.out.println("NO");
    }
}
