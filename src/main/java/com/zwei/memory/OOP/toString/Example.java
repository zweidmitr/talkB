package com.zwei.memory.OOP.toString;

public class Example {
    String name;
    int id;

    public Example(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return name + " " + id;
    }
}
