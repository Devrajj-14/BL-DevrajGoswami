package javaContorlFlow.level3;

import java.util.Scanner;

/*
 * Program: Armstrong Number Check
 * Input: integer number
 * Output: Armstrong Number or Not Armstrong Number
 * Armstrong example: 153 = 1^3 + 5^3 + 3^3
 */
public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        int originalNumber = number;
        int sum = 0;

        // Extract each digit and add cube of digit to sum
        while (originalNumber != 0) {
            int digit = originalNumber % 10; // last digit
            sum += digit * digit * digit;    // cube addition
            originalNumber = originalNumber / 10; // remove last digit
        }

        // Compare computed sum with original number
        if (sum == number) System.out.println("Armstrong Number");
        else System.out.println("Not an Armstrong Number");

        sc.close();
    }
}
