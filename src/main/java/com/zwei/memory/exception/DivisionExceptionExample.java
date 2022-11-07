package com.zwei.memory.exception;

import java.io.IOException;
import java.util.Scanner;

public class DivisionExceptionExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // try catch
        // throw
        // throws
        // finally

        while (true) {
            int a = in.nextInt();
            int b = in.nextInt();
            try {

                int div = divide(a, b);
                System.out.println("a / b = " + div);
            } catch (RuntimeException ex) {
                System.out.println("You trying to divide by zero. Please enter new numbers");
            } catch (IOException ex2) {
                System.out.println("never IOException");
            }
        }
    }

    // declare, catch, handle
    public static int divide(int a, int b) throws ArithmeticException, IOException, RuntimeException {
        if (b == 0) throw new ArithmeticException();
        if (a == 1) throw new IOException();
        return a / b;
    }
}
