package com.zwei.memory.OOP.inheritance;

public class TestInheritance {
    public static void main(String[] args) {
        Jack jack = new Jack("Jack", "Dawson", 25);
        System.out.println(jack.getName() + " is an " + jack.getNationality());
        jack.print();
        // public, protected, default, private

        System.out.println(jack);
        System.out.println(jack.parentToString());

        Clone clone = new Clone("JackClone", "null", 0);
        System.out.println(clone + " - " + clone.parentRoString3());
        Clone r2d2 = new Clone();

        jack.print();

        jack.count(); // можно наследовать статичные методы, но нельзя Override
        Human.count();
    }
}
