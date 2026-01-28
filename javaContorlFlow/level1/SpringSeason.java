package javaContorlFlow.level1;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter day: ");
        int day = sc.nextInt();

        // basic validation for month and day
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            System.out.println("Invalid date");
            sc.close();
            return;
        }

        boolean isSpring = false;

        // spring season: March, April, May
        if (month == 3 || month == 4 || month == 5) {
            isSpring = true;
        }

        if (isSpring) {
            System.out.println("Spring season");
        } else {
            System.out.println("Not spring season");
        }

        sc.close();
    }
}
