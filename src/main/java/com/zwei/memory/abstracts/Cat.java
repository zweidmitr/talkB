package com.zwei.memory.abstracts;

public class Cat extends Animal {
    @Override
    public void walk() {
        System.out.println("cat is walking");
    }

    public void cat_sound() {
        System.out.println("Myau");
    }

    @Override
    public void eat() {
        System.out.println("cat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("cat is eating");
    }
}
