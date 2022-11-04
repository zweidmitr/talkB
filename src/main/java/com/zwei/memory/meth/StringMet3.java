package com.zwei.memory.meth;

public class StringMet3 {
    public static void main(String[] args) {
        String s = "Welcome to Java";
        System.out.println(s.indexOf("e"));
        System.out.println(s.indexOf("e", 4));
        System.out.println(s.indexOf("g"));
        System.out.println(s.indexOf("a"));
        System.out.println(s.lastIndexOf("a"));
    }
}
