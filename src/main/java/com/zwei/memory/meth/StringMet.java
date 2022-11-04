package com.zwei.memory.meth;

import java.util.Locale;

public class StringMet {
    public static void main(String[] args) {
        String s = "Welcome to Java";
        String sTrim = "    Welcome to Java   ";
        String ss = new String("Welcome");
        System.out.println(s.length());
        System.out.println(s.charAt(2));
        System.out.println(s.concat(" ").concat(ss));
        System.out.println(s + " " + ss);
        System.out.println(ss.toUpperCase());
        System.out.println(ss.toLowerCase());
        System.out.println(sTrim.trim());
    }
}
