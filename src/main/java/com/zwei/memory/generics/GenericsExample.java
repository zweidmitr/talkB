package com.zwei.memory.generics;

public class GenericsExample {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        show(a, b);
        Long c = 7L;
        Long d = 3L;
        show(c, d);
        String s = "abs";
        String ss = "sba";
        show(s, ss);
        show(a, s);


        Person<Integer> p = new Person<>();

        Person<Double> p2 = new Person<>();
        p2.show(3.1, 4.5);
        System.out.println();

        Person<Integer> p3 = new Person<>(5,6);
        System.out.println(p3.getA());
        System.out.println(p3.getB());
    }

    public static <T, U> void show(T a, U b) {
        System.out.println(a + " " + b);
    }

}

class Person<T> {

    T a;
    T b;

    public Person() {
    }

    public Person(T a, T b) {
        this.a = a;
        this.b = b;
    }

    public void show(T a, T b) {
        System.out.println(a + " " + b);
    }

    public T getA() {
        return a;
    }

    public T getB() {
        return b;
    }
}
