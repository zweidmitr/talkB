package com.zwei.memory.collections;

import java.util.*;

public class Collections3 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(); // FIFO
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
        System.out.println();


        Queue<Integer> prQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        prQueue.add(5);
        prQueue.add(1);
        prQueue.add(3);
        prQueue.add(4);
        while (!prQueue.isEmpty()) {
            System.out.print(prQueue.poll() + " ");
        }

    }
}
