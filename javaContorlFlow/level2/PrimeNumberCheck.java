package javaContorlFlow.level2;

import java.util.Scanner;

/*
 * Program: Prime Number Checker
 * Input: integer n
 * Output: Prints whether the number is Prime or Not Prime
 * Note: Prime numbers are greater than 1 and divisible only by 1 and itself
 */
public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        boolean isPrime = true;

        // Numbers <= 1 are not prime
        if (n <= 1) {
            isPrime = false;
        } else {
            // Check divisibility from 2 to n-1
            for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0) {
                    isPrime = false; // found a divisor
                    break; // no need to continue
                }
            }
        }

        System.out.println(isPrime ? "Prime Number" : "Not a Prime Number");
        sc.close();
    }
}
