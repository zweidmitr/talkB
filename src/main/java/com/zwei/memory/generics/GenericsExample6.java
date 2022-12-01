package com.zwei.memory.generics;

import java.util.ArrayList;

public class GenericsExample6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
//        ArrayList list = new ArrayList();
//        ArrayList<Object> list = new ArrayList<>();

        list.add("ABS");

        String s = list.get(0);
        System.out.println(s);

//        ArrayList<Integer> arrayList[] = (ArrayList<Integer>[]) new ArrayList[10];
    }

    public static <T> void show(T t) {
        // t - show only Objects methods

        // T t2 = new T();
        T t2 = (T) new Object();
    }
}

class Pers<T> {
    static int x = 5;
    //    static T t;
    T t2;
}
