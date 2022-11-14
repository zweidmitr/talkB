package com.zwei.memory.OOP.interf;

public class Animal implements Sleepable {

    public void walk() {
        System.out.println("animal is walking");
    }

    @Override
    public void sleep() {
        System.out.println("animal is sleeping");
    }

}
