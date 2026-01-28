package javaContorlFlow.level2;

import java.util.Scanner;

public class LeapYearIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter year ");
        int year = sc.nextInt();

        // validation for year
        if (year <= 0) {
            System.out.println("invalid input");
            sc.close();
            return;
        }

        boolean isLeap;

        // leap year rules using if else
        if (year % 400 == 0) {
            isLeap = true;
        } else if (year % 100 == 0) {
            isLeap = false;
        } else if (year % 4 == 0) {
            isLeap = true;
        } else {
            isLeap = false;
        }

        if (isLeap) {
            System.out.println("leap year");
        } else {
            System.out.println("not leap year");
        }

        sc.close();
    }
}
