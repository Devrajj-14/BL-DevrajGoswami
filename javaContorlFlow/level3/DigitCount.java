package javaControlFlow.level3;

import java.util.Scanner;

/*
 * Program: Count digits in a number
 * Input: integer number
 * Output: Number of digits
 */
public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        int count = 0;

        // Special case: 0 has 1 digit
        if (number == 0) {
            System.out.println("Digit count = 1");
            sc.close();
            return;
        }

        // Convert negative to positive for counting
        if (number < 0) number = -number;

        // Keep removing last digit and count
        while (number != 0) {
            number = number / 10; // remove last digit
            count++; // increase digit count
        }

        System.out.println("Digit count = " + count);
        sc.close();
    }
}
