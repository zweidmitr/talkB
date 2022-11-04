package com.zwei.memory.methods;

public class Array {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        check(arr);
        System.out.println();
        check(new int[]{3,4,5,6,7,8});
    }

    public static void check(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
