package javaContorlFlow.level2;

import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number ");
        int n = sc.nextInt();

        // validation for zero and negatives
        if (n <= 0) {
            System.out.println("invalid input");
            sc.close();
            return;
        }

        // loop to print factors
        for (int i = 1; i <= n; i++) {
            // checking factor
            if (n % i == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
