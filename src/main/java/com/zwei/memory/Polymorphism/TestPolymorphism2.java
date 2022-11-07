package com.zwei.memory.Polymorphism;

public class TestPolymorphism2 {
    public static void main(String[] args) {
        // instanceof
        // Casting implicit vs explicit

        Animal a = new Dog(); // implicit casting -> upcasting
        a.walk();

        Dog d = (Dog) a;
        d.dog_sound();

        System.out.println();
        if (a instanceof Dog) {
            ((Dog) a).dog_sound();
        }

        System.out.println();
        ((Dog) a).dog_sound();

        System.out.println();
        Dog dog = new Dog();
        dog.dog_sound();

    }
}
