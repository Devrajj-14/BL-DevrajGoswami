package javaArrays.level1;

import java.util.Scanner;

/*
this program prints multiplication table of a number using an array
stores results from 1 to 10 then prints in required format
*/
public class MultiplicationTableStoreInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number ");
        int number = sc.nextInt();

        int[] table = new int[10];

        // loop to store multiplication results
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // loop to display from array
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        sc.close();
    }
}
