package com.zwei.memory.OOP.interf;

public class TestInterface {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sleep();
        animal.walk();

        Sleepable sleepObj = new Animal();
        sleepObj.sleep();

        Sleepable[] arr = new Sleepable[9999];
        for (int i = 0; i < 9999; i++)
            checkSleepable(arr[i]);
    }

    public static void checkSleepable(Sleepable a) {
        a.sleep();
    }
}
