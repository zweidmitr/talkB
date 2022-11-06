package com.zwei.memory.OOP.oop;

public class Student {
    private int age;
    private int weight;
    private String name;
    private String surname;

    public Student() {

    }

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Student(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    public Student(int age, int weight, String name, String surname) {
        this.age = age;
        this.weight = weight;
        this.name = name;
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
