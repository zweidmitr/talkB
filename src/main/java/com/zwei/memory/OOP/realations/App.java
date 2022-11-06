package com.zwei.memory.OOP.realations;

public class App {
    public static void main(String[] args) {

        //Composition
        Heart heart = new Heart();
        Human human = new Human(heart);
        human.getHEART().pounding();

    }
}
