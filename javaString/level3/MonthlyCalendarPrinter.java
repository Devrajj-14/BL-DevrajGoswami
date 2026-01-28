package javaString.level3;
import java.util.*;

public class MonthlyCalendarPrinter {
    static String monthName(int m) {
        String[] months = {
            "January","February","March","April","May","June",
            "July","August","September","October","November","December"
        };
        return months[m - 1];
    }

    static boolean leap(int y) {
        if (y % 400 == 0) return true;
        if (y % 100 == 0) return false;
        return y % 4 == 0;
    }

    static int daysInMonth(int m, int y) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (m == 2 && leap(y)) return 29;
        return days[m - 1];
    }

    static int firstDay(int m, int y) {
        int d = 1;
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        return d0;
    }

    static void printCal(int m, int y) {
        System.out.println(monthName(m) + " " + y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int fd = firstDay(m, y);
        int dm = daysInMonth(m, y);

        for (int i = 0; i < fd; i++) System.out.print("    ");

        for (int day = 1; day <= dm; day++) {
            System.out.printf("%3d ", day);
            if ((fd + day) % 7 == 0) System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("month");
        int m = sc.nextInt();
        System.out.println("year");
        int y = sc.nextInt();
        printCal(m, y);
        sc.close();
    }
}
