package com.zwei.memory.file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileExScanner {
    public static void main(String[] args) throws IOException {
        File file = new File("out.txt");
        Scanner in = new Scanner(file);
        // scanner сам конвертирует из байтов в нужный тип
        // считывает до первого токена - в scanner это пробел -
        // дальше конвертирует прочитанное, потом читает дальше
        while (in.hasNext()) {
            String s = in.next();
            System.out.print(s + " ");
            // недостаток в указании типа ожидаемых данных
        }
        in.close();
        // токен можно менять с пробела на запятые, точки и т.д.
    }
}
