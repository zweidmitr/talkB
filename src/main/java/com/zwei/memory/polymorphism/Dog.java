package com.zwei.memory.polymorphism;

public class Dog extends Animal {
    @Override
    public void walk() {
        System.out.println("dog is walking");
    }

    public void dog_sound() {
        System.out.println("gav-gav");
    }
}
