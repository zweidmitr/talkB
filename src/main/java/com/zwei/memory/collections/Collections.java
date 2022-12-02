package com.zwei.memory.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collections {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(99);
        list.add(11);
        list.add(44);
        list.add(0);
        System.out.println(list.contains(11));

        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");
        System.out.println();
        list.remove(1);

        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ") ;
        }

    }
}
