package com.zwei.memory.OOP.abstracts;

public class TestAbstract {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();

//      Animal animal = new Animal();
        Animal animal = new Cat();
        Animal animalTwo = new Dog();

        animal.sleep();
        animal.eat();

        animalTwo.sleep();
        animalTwo.eat();
    }
}
