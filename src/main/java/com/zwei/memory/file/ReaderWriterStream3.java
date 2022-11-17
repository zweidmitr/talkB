package com.zwei.memory.file;

import java.io.*;

public class ReaderWriterStream3 {
    public static void main(String[] args) throws Exception {
        File file = new File("objectOutput.txt");
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));

        String s = "ABS";
        int[] a = {3, 4, 5};
        String ups = "UPS";

        out.writeObject(s);
        out.writeObject(a);
        out.close();

        String ss = (String) in.readObject();
//        int[] aa = (int[]) in.readObject();
        in.close();
        System.out.println(ss);
//        System.out.println(Arrays.toString(aa));
    }
}
