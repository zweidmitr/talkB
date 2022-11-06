package com.zwei.memory.OOP.toString;

import com.zwei.memory.OOP.toString.Example;

public class ToString {
    public static void main(String[] args) {
        String s = new String("JAck");
        System.out.println(s);
        System.out.println(s.toString());

        Example example = new Example("John",1);
        System.out.println(example.toString());
    }
}
