package com.zwei.memory.OOP.interf.cloneable;

public class TestCloneable {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person(3, "Jack");
        Person person2 = person1; // ссылка на объект, не копирование

        person1.setId(10);
        System.out.println(person1.getId());
        System.out.println(person2.getId());
        System.out.println();

        Person person3 = (Person) person2.clone();
        person1.setId(7);

        System.out.println(person1.getId());
        System.out.println(person3.getId());

    }
}
