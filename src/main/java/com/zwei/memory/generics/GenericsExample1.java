package com.zwei.memory.generics;

import java.util.ArrayList;
import java.util.Date;

public class GenericsExample1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add("abs");
        list.add(new Date());
        list.add(99.9);

        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));

        String s = (String) list.get(1);
    }
}
