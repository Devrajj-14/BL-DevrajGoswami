package javaControlFlow.level3;

import java.util.Scanner;

/*
 * Program: Day of Week Finder (Gregorian Calendar)
 * Input: month (m), day (d), year (y)
 * Output: 0=Sunday, 1=Monday, ... 6=Saturday
 * Formula:
 * y0 = y − (14 − m) / 12
 * x  = y0 + y0/4 − y0/100 + y0/400
 * m0 = m + 12 × ((14 − m) / 12) − 2
 * d0 = (d + x + 31m0 / 12) mod 7
 */
public class DayOfWeek {
    static int dayOfWeek(int m, int d, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        return d0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int m = sc.nextInt();
        System.out.print("Enter day (1-31): ");
        int d = sc.nextInt();
        System.out.print("Enter year: ");
        int y = sc.nextInt();

        // Basic validation for month and day range
        if (m < 1 || m > 12 || d < 1 || d > 31) {
            System.out.println("Invalid date input");
            sc.close();
            return;
        }

        int ans = dayOfWeek(m, d, y);
        System.out.println("Day of week = " + ans);

        sc.close();
    }
}
