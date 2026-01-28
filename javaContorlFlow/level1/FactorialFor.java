package javaContorlFlow.level1;

import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a non-negative number: ");
        int n = sc.nextInt();

        // validation for negative numbers
        if (n < 0) {
            System.out.println("Invalid input");
            sc.close();
            return;
        }

        // factorial grows fast, long is safe till 20!
        if (n > 20) {
            System.out.println("Number too large");
            sc.close();
            return;
        }

        long fact = 1;

        // for loop factorial
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial: " + fact);
        sc.close();
    }
}
