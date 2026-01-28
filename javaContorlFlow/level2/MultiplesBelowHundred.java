package javaContorlFlow.level2;

import java.util.Scanner;

public class MultiplesBelowHundred {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number ");
        int n = sc.nextInt();

        // validation for n
        if (n <= 0) {
            System.out.println("invalid input");
            sc.close();
            return;
        }

        // loop to print multiples below 100
        for (int i = n; i < 100; i += n) {
            System.out.println(i);
        }

        sc.close();
    }
}
