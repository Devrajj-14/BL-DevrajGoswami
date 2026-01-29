package javaArrays.level1;

import java.util.Scanner;

/*
this program takes 5 numbers in an array
checks positive negative zero and for positive checks even odd
then compares first and last element
*/
public class NumberTypeEvenOddAndCompareEnds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        // loop for input
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("enter number ");
            numbers[i] = sc.nextInt();
        }

        // loop for number type checks
        for (int i = 0; i < numbers.length; i++) {
            int n = numbers[i];

            // positive negative zero check
            if (n > 0) {
                // even odd check only for positive
                if (n % 2 == 0) {
                    System.out.println(n + " positive even");
                } else {
                    System.out.println(n + " positive odd");
                }
            } else if (n < 0) {
                System.out.println(n + " negative");
            } else {
                System.out.println(n + " zero");
            }
        }

        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        // compare first and last
        if (first == last) {
            System.out.println("first and last are equal");
        } else if (first > last) {
            System.out.println("first is greater than last");
        } else {
            System.out.println("first is less than last");
        }

        sc.close();
    }
}
