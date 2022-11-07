package com.zwei.memory.Polymorphism;

public class TestPolymorphism1 {
    public static void main(String[] args) {

        // Dynamic binding
        // A -> B -> C -> D
        // A a = new D()
        // a.walk()

        Animal siamskaya = new Siamskaya();
        Animal alabay = new Alabay();

        siamskaya.walk();
        alabay.walk();
    }
}
