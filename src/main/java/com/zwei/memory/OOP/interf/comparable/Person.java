package com.zwei.memory.OOP.interf.comparable;

public class Person implements Comparable<Person> {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Person p) {
        if (this.id - p.id < 0) return -1;
        else if (this.id - p.id == 0) return 0;
        else return 1;
    }
}
