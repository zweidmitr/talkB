package com.zwei.memory.meth;

public class StringMet5_StringPool {
    public static void main(String[] args) {
        // == and equals
        String a = new String("abc");
        String b = new String("abc");
        System.out.println(a.equals(b));
        System.out.println(a == b);

        System.out.println("====");
        // == Reference
        // Pool
        String s = "Apple";
        String t = new String("Apple");
        System.out.println(s == t);

        t = t.intern();

        System.out.println(s == t);
    }
}
