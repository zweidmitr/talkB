package com.zwei.memory.OOP.inheritance;

public class Jack extends Human {
    String name;
    String surname;
    int age;

    public Jack(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Jack() {
//        super()
        System.out.println("Jack is called");
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return name + " " + surname + " " + age;
    }

    public String parentToString() {
        return super.toString();
    }

    // private default protected public
    // можно оставить модификатор таким же или сделать сильнее -> был protected стал public
    // все приватные данные / методы не пероходят наследнику
    @Override
    public void print() {
        System.out.println("Jack is printing");
    }

//    @Override
//    public static void count() {
//        System.out.println("JAck is counting");
//    }
}
