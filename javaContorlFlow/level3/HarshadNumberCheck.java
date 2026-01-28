package javaControlFlow.level3;

import java.util.Scanner;

/*
 * Program: Harshad Number Check
 * Input: integer number
 * Output: Harshad Number or Not Harshad Number
 * A Harshad number is divisible by sum of its digits (example: 21 / (2+1) = 7)
 */
public class HarshadNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        int original = number;
        int sum = 0;

        // Negative numbers are usually not considered Harshad in basics
        if (number <= 0) {
            System.out.println("Not a Harshad Number");
            sc.close();
            return;
        }

        // Extract digits and add them
        while (number != 0) {
            int digit = number % 10; // last digit
            sum += digit; // add digit to sum
            number = number / 10; // remove last digit
        }

        // Check divisibility with sum of digits
        if (sum != 0 && original % sum == 0) System.out.println("Harshad Number");
        else System.out.println("Not a Harshad Number");

        sc.close();
    }
}
