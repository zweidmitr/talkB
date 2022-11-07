package com.zwei.memory.inheritance;

public class Human {
    String nationality = "American";
    String residence = "USA";

    public Human() {
        System.out.println("Human is called");
    }

    public String getNationality() {
        return nationality;
    }

    public String getResidence() {
        return residence;
    }

    protected void print() {
        System.out.println("Human is printing");
    }

    public final void printHuman() {
        System.out.println("only Human is printing");
    }

    public String toString() {
        return nationality + " " + residence;
    }

    public static void count() {
        System.out.println("Human is counting");
    }
}

