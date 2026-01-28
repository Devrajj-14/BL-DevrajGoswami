package javaContorlFlow.level1;

import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        // validation for negative inputs
        if (salary < 0 || years < 0) {
            System.out.println("Invalid input");
            sc.close();
            return;
        }

        double bonus = 0;

        // if-else for bonus eligibility
        if (years > 5) {
            bonus = salary * 0.05;
        }

        System.out.println("Bonus: " + bonus);
        sc.close();
    }
}
