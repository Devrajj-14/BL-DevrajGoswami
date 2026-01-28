package javaContorlFlow.level2;

import java.util.Scanner;

/*
 * Program: FizzBuzz using for loop
 * Input: A positive integer n
 * Output: Prints numbers from 0 to n,
 *         multiples of 3 -> Fizz,
 *         multiples of 5 -> Buzz,
 *         multiples of both -> FizzBuzz
 */
public class FizzBuzzFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();

        // If user enters negative, stop the program
        if (n < 0) {
            System.out.println("Not a positive integer.");
            sc.close();
            return;
        }

        // Loop from 0 to n and print Fizz/Buzz rules
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }

        sc.close();
    }
}
