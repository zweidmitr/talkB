package com.zwei.memory.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Collections2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 20_000_000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

//        get(arrayList, linkedList);
        remove(arrayList, linkedList);

    }

    public static void remove(ArrayList<Integer> list, LinkedList<Integer> link) {
        long start = System.currentTimeMillis();
        list.remove(0);
        long end = System.currentTimeMillis();
        System.out.println("Time taken for ArrayList to remove element is " + (end - start) + " ms");


        start = System.currentTimeMillis();
        link.remove(0);
        end = System.currentTimeMillis();
        System.out.println("Time taken for LinkedList to remove element is " + (end - start) + " ms");
    }

    public static void get(ArrayList<Integer> list, LinkedList<Integer> link) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++)
            list.get(i);
        long end = System.currentTimeMillis();
        System.out.println("Time taken for arraylist is : " + (end - start) + " ms");


        start = System.currentTimeMillis();
//        for (int i = 0; i <link.size(); i++)
//            link.get(i);
//            Iterator<Integer> iterator = link.iterator();
//            while(iterator.hasNext())
//                iterator.next();
        for (Integer integer : link)

            end = System.currentTimeMillis();
        System.out.println("Time taken for linkedList is : " + (end - start) + " ms");
    }
}
