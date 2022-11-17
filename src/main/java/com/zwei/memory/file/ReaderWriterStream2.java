package com.zwei.memory.file;

import java.io.*;

public class ReaderWriterStream2 {
    public static void main(String[] args) throws Exception {
        File file = new File("bufferedOutputStream.txt");
        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
        DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));

        out.writeUTF("здравствуй");
        // out.write(123);
        out.writeInt(300);
        out.close();

        System.out.println(in.readUTF());
        System.out.println(in.readInt());
        in.close();
    }
}
