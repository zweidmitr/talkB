package com.zwei.memory.exception;

public class PositiveRadiusCount {
    public static void main(String[] args) {
        try {
            new Radius(1);
            new Radius(2);
            new Radius(-5);
            new Radius(5);
        } catch (NegativeRadiusException e) {
            System.out.println("Negative radius is caught " + e.getR());
        }

        System.out.println("Positive radius count " + Radius.getCount());

    }
}

class Radius {
    int r;
    static int count = 0;

    public Radius(int r) throws NegativeRadiusException {
        if (r < 0) throw new NegativeRadiusException(r);
        this.r = r;
        count++;
    }

    public static int getCount() {
        return count;
    }
}
