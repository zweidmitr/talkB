package com.zwei.memory.file;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TryWithResources {
    public static void main(String[] args) {
        try (Scanner in = new Scanner("out.txt");
             PrintWriter out = new PrintWriter("output.txt")) {
        } catch (IOException e) {

        }
    }
}
