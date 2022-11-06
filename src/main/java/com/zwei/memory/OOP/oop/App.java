package com.zwei.memory.OOP.oop;

public class App {
    public static void main(String[] args) {
        Student s1 = new Student(18, 70, "John", "Doe");
        System.out.println(s1.getName() + " " + s1.getSurname() + " " + s1.getAge() + " " + s1.getWeight());
        Student s2 = new Student("Jack", "Dawson");
        System.out.println(s2.getName() + " " + s2.getSurname() + " " + s2.getAge() + " " + s2.getWeight());
    }
}
