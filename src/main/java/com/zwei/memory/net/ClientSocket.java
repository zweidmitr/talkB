package com.zwei.memory.net;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientSocket {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1", 8081);
        PrintWriter out = new PrintWriter(socket.getOutputStream());
        Scanner in = new Scanner(socket.getInputStream());
        Scanner send = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter something to send: ");
            String words = send.nextLine();
            out.println(words);
            out.flush();
            String s = in.nextLine();
            System.out.println("Data from server has come: " + s);

        }
//        out.close();
//        socket.close();
    }
}
