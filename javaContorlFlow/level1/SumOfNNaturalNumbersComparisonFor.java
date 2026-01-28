package javaContorlFlow.level1;

import java.util.Scanner;

public class SumOfNNaturalNumbersComparisonFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        long n = sc.nextLong();

        // validation for non-positive N
        if (n <= 0) {
            System.out.println("Invalid input");
            sc.close();
            return;
        }

        long sumLoop = 0;

        // for loop sum
        for (long i = 1; i <= n; i++) {
            sumLoop = sumLoop + i;
        }

        // formula sum
        long sumFormula = (n * (n + 1)) / 2;

        System.out.println("Sum using loop: " + sumLoop);
        System.out.println("Sum using formula: " + sumFormula);

        sc.close();
    }
}
