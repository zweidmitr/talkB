package com.zwei.memory.file;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileExWrite {
    public static void main(String[] args) throws IOException {
        File file = new File("out.txt");
        PrintWriter writer = new PrintWriter(file);

        writer.println("Hello my friend");
        writer.println("this is test file");

        writer.close(); // важн закрывать writer
    }

}
