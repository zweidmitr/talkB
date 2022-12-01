package com.zwei.memory.generics;

public class GenericsExample2 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        show(cat);
        Dog dog = new Dog();
//        show(dog);
        Animal animal = new Animal();
        show(animal);
        Cat b = show(cat);
        Cat a = (Cat) show2(cat); // Animal -> Cat

    }

    public static <T extends Animal> T show(T a) {
        return a; // return "class extends Animal"

    }

    public static Animal show2(Animal a) {
        return a; // return only Animal
    }
}

class Animal {
    public Animal() {
        System.out.println("I'm Animal");
    }
}


class Cat extends Animal {
    public Cat() {
        System.out.println("I'm Cat");
    }
}

class Dog {
    public Dog() {
        System.out.println("I'm Dog");
    }
}
