package com.zwei.memory.exception;

import java.io.IOException;

public class ChainExceptionHandle {
    public static void main(String[] args) {
        try {
            method1();
            System.out.println("after method 1");
        } catch (ArithmeticException ex) {
            System.out.println("Arithmetical is caught");
        }
    }

    private static void method1() {
        try {
            method2();
            System.out.println("after method 2");
        } catch (IOException ex) {
            System.out.println("IOException is called");
        }
    }

    private static void method2() throws IOException, ArithmeticException {
        throw new ArithmeticException();
    }
}
