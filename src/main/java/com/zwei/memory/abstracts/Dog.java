package com.zwei.memory.abstracts;

import java.sql.SQLOutput;

public class Dog extends Animal {
    @Override
    public void walk() {
        System.out.println("dog is walking");
    }

    public void dog_sound() {
        System.out.println("gav-gav");
    }

    @Override
    public void eat() {
        System.out.println("dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("dog is eating");
    }
}
