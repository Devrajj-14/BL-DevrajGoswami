package javaArrays.level2;

import java.util.Scanner;

/*
this program takes salary and years for 10 employees
calculates bonus and new salary and prints totals
*/
public class EmployeeBonusForTenEmployees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] salary = new double[10];
        double[] years = new double[10];

        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0.0;
        double totalOld = 0.0;
        double totalNew = 0.0;

        // loop for input with validation
        for (int i = 0; i < salary.length; i++) {
            System.out.print("enter salary ");
            double s = sc.nextDouble();

            System.out.print("enter years of service ");
            double y = sc.nextDouble();

            // invalid input so retry same employee
            if (s <= 0 || y < 0) {
                System.out.println("invalid input");
                i--;
                continue;
            }

            salary[i] = s;
            years[i] = y;
        }

        // loop to calculate bonus and totals
        for (int i = 0; i < salary.length; i++) {
            double rate;

            // bonus rule
            if (years[i] > 5) rate = 0.05;
            else rate = 0.02;

            bonus[i] = salary[i] * rate;
            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOld += salary[i];
            totalNew += newSalary[i];
        }

        System.out.println("total old salary " + totalOld);
        System.out.println("total new salary " + totalNew);
        System.out.println("total bonus " + totalBonus);

        sc.close();
    }
}
