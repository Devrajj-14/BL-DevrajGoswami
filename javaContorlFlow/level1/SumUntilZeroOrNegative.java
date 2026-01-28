 package javaContorlFlow.level1;

import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        // loop until user enters 0 or negative
        while (true) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            // stop when zero or negative comes
            if (num <= 0) {
                break;
            }

            sum = sum + num;
        }

        System.out.println("Sum: " + sum);
        sc.close();
    }
}
