package com.zwei.memory.generics;

import java.util.List;

public class GenericsExample5 {
    public static void main(String[] args) {

    }

    // can write:
    // compare1(List<? super Animal1> list)
    public static void compare1(List<?> list) {

    }

    // can write:
    // compare2(T list)
    // <T extends Comparable & Cloneable>
    // public static <T> T compare2(List<T> list)
    public static <T> void compare2(List<T> list) {

    }

    public static void check1(List<?> list) {
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }

    public static void check2(List<? extends Animal1> list) {
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }

    public static void check3(List<? super Animal1> list) {
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }
}
