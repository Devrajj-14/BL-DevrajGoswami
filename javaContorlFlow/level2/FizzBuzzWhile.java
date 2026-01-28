package javaContorlFlow.level2;

import java.util.Scanner;

public class GreatestFactorExceptItself {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number ");
        int n = sc.nextInt();

        // validation for small values
        if (n <= 1) {
            System.out.println("invalid input");
            sc.close();
            return;
        }

        int greatest = 1;

        // loop to find greatest factor except itself
        for (int i = n / 2; i >= 1; i--) {
            // first factor from top is the great
