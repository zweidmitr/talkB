package com.zwei.memory.collections;

import java.util.LinkedList;

public class Collections1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.remove(3);

        for (int i = 0; i < linkedList.size(); i++)
            System.out.print(linkedList.get(i) + " ");
        System.out.println();

        for (Integer integer : linkedList)
            System.out.print(integer + " ");
    }
}
