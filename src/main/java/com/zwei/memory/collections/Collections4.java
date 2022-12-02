package com.zwei.memory.collections;

import com.sun.tools.javac.Main;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Collections4 {
    public static void main(String[] args) {
        Deque<Integer> dequeList = new LinkedList<>();
        Deque<Integer> dequeArray = new ArrayDeque<>();

        dequeArray.add(1);
        dequeArray.addFirst(0);
        dequeArray.addLast(12);

        while (!dequeArray.isEmpty()) {
            System.out.print(dequeArray.poll() + " ");
        }
        System.out.println();

        dequeList.add(1);
        dequeList.addFirst(0);
        dequeList.addLast(12);

        while (!dequeList.isEmpty()) {
            System.out.print(dequeList.poll() + " ");
        }
        System.out.println();

    }
}
