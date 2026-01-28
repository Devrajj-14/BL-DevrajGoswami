package javaContorlFlow.level2;

import java.util.Scanner;

public class LeapYearSingleIf {
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

        boolean isLeap = false;

        // single if style with combined condition
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            isLeap = true;
        }

        if (isLeap) {
            System.out.println("leap year");
        } else {
            System.out.println("not leap year");
        }

        sc.close();
    }
}
