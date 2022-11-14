package com.zwei.memory.OOP.interf.cloneable;

public class Person implements Cloneable {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person clone() throws CloneNotSupportedException {
        // native - то что происходит в ядре, и нам не увидеть
        return (Person) super.clone();
    }
}
