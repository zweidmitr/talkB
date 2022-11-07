package com.zwei.memory.exception;

public class NegativeRadiusException extends Exception {
    public int r;

    public NegativeRadiusException() {
    }

    public NegativeRadiusException(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }
}
