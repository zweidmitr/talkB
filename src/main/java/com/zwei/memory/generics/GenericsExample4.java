package com.zwei.memory.generics;

import java.util.ArrayList;
import java.util.List;

// Wildcards = ?, ? extends class, ? super class
public class GenericsExample4 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(10);
        list1.add(15);

        List<Double> list2 = new ArrayList<>();
        list2.add(1.2);
        list2.add(2.2);
        list2.add(3.2);

        check1(list1);
        System.out.println();
        check1(list2);
        System.out.println();

        List<Animal1> animal1s = new ArrayList<>();
        animal1s.add(new Cat1());
        animal1s.add(new Animal1());

        check2(animal1s);
        System.out.println();
        check3(animal1s);
        System.out.println();

//        List<Integer> list4 = new ArrayList<>();
//        check3(list4);

        List<Bacteria1> list5 = new ArrayList<>();
        check3(list5);
//        check2(list5);
        check1(list5);

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

class Bacteria1 {
}

class Animal1 extends Bacteria1 {

}

class Cat1 extends Animal1 {

}
