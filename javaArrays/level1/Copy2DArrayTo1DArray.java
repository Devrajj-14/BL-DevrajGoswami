package javaArrays.level1;

import java.util.Scanner;

/*
this program takes a 2d array input and copies it into a 1d array
uses nested loops for rows and columns
*/
public class Copy2DArrayTo1DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter rows ");
        int rows = sc.nextInt();

        System.out.print("enter columns ");
        int cols = sc.nextInt();

        if (rows <= 0 || cols <= 0) {
            System.out.println("invalid input");
            sc.close();
            return;
        }

        int[][] matrix = new int[rows][cols];

        // nested loop to take 2d input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("enter value ");
                matrix[i][j] = sc.nextInt();
            }
        }

        int[] array = new int[rows * cols];
        int index = 0;

        // nested loop to copy into 1d
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }

        // loop to print 1d array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        sc.close();
    }
}
