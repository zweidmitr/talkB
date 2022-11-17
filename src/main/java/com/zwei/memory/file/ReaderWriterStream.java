package com.zwei.memory.file;

import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class ReaderWriterStream {
    public static void main(String[] args) throws Exception {
        File file = new File("output.txt");
        PrintWriter out = new PrintWriter(file);
        FileReader in = new FileReader(file);

        out.print("moment");
        out.print(125);
        out.close();

        // filereader read on 1 byte
        int temp;
        while ((temp = in.read()) != -1) {
//            System.out.println(temp);
            System.out.print((char) temp);
        }
        in.close();
    }
}
