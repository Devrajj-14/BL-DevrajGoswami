package javaArrays.level1;

import java.util.Scanner;

/*
this program stores odd and even numbers from 1 to n into two arrays
then prints both arrays using their index counts
*/
public class StoreOddEvenNumbersInSeparateArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number ");
        int number = sc.nextInt();

        // check natural number
        if (number <= 0) {
            System.out.println("invalid input");
            sc.close();
            return;
        }

        int size = number / 2 + 1;
        int[] odd = new int[size];
        int[] even = new int[size];

        int oddIndex = 0;
        int evenIndex = 0;

        // loop from 1 to number
        for (int i = 1; i <= number; i++) {
            // store odd or even
            if (i % 2 == 0) {
                even[evenIndex] = i;
                evenIndex++;
            } else {
                odd[oddIndex] = i;
                oddIndex++;
            }
        }

        System.out.println("odd numbers");
        // loop to print odd array
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }

        System.out.println();
        System.out.println("even numbers");
        // loop to print even array
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }

        System.out.println();
        sc.close();
    }
}
