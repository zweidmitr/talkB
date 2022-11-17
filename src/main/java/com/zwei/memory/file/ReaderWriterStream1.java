package com.zwei.memory.file;

import java.io.*;

public class ReaderWriterStream1 {
    public static void main(String[] args) throws Exception {
        File file = new File("outputStream.txt");
        DataOutputStream out = new DataOutputStream(new FileOutputStream(file));
        DataInputStream in = new DataInputStream(new FileInputStream(file));

        out.writeUTF("privet");
        out.write(123);
        out.close();

        System.out.println(in.readUTF());
        System.out.println(in.read());
        in.close();
    }
}
