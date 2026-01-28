package javaContorlFlow.level1;

import java.util.Scanner;

public class OddEvenUpToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        // validation for non-positive N
        if (n <= 0) {
            System.out.println("Invalid input");
            sc.close();
            return;
        }

        // loop from 1 to N
        for (int i = 1; i <= n; i++) {
            // checking odd/even
            if (i % 2 == 0) {
                System.out.println(i + " Even");
            } else {
                System.out.println(i + " Odd");
            }
        }

        sc.close();
    }
}
