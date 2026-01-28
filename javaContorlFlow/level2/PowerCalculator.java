package javaContorlFlow.level2;

import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter base ");
        long base = sc.nextLong();

        System.out.print("enter exponent ");
        int exp = sc.nextInt();

        // validation for negative exponent
        if (exp < 0) {
            System.out.println("invalid input");
            sc.close();
            return;
        }

        long result = 1;

        // loop to calculate power
        for (int i = 1; i <= exp; i++) {
            result = result * base;
        }

        System.out.println(result);
        sc.close();
    }
}
