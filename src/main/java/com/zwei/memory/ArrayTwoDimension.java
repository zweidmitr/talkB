package com.zwei.memory;

import java.util.Arrays;

public class ArrayTwoDimension {
    public static void main(String[] args) {
        int[][] arr2D = new int[5][10];
        arr2D[0][3] = 1;
        arr2D[4][0] = 2;

        int arr3D[][][] = new int[10][5][100];
        arr3D[1][4][50] = 123;

        int[][] matrixExample = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9},
                {10, 11, 12},
                {13, 14},
                {15}
        };
        int[][] matrix = new int[9][9];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j || j == matrix.length - 1 - i || i == 0 || j == 0 || i == matrix.length - 1 || j == matrix.length - 1)
                    matrix[i][j] = 1;
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}