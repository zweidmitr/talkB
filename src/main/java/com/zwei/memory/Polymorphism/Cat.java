package com.zwei.memory.Polymorphism;

public class Cat extends Animal {
    @Override
    public void walk() {
        System.out.println("cat is walking");
    }

    public void cat_sound() {
        System.out.println("Myau");
    }
}
