package com.zwei.memory.OOP.abstracts;

public abstract class Animal {
    // Abstract - нельзя создать animal как объект
    // потомки обязаны переопределить abstract methods
    // конструктор всегда запускается
    // можно делать цепочку абстрактных классав через подклассы

    public Animal() {
        System.out.println("Animal constructor");
    }

    public abstract void eat();

    public abstract void sleep();

    public void walk() {
        System.out.println("Animal is walking");
    }
}
