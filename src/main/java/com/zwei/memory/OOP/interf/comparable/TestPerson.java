package com.zwei.memory.OOP.interf.comparable;

import java.util.Arrays;

public class TestPerson {
    public static void main(String[] args) {
        Person[] persons = new Person[3];

        persons[0] = new Person(5, "John");
        persons[1] = new Person(3, "Jack");
        persons[2] = new Person(4, "Adam");

        Arrays.sort(persons);
        for (int i = 0; i < 3; i++) {
            System.out.println(persons[i].getId());
        }
    }
}
