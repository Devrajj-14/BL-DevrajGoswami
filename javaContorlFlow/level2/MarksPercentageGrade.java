package javaContorlFlow.level2;

import java.util.Scanner;

public class MarksPercentageGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter marks ");
        double marks = sc.nextDouble();

        // validation for marks
        if (marks < 0 || marks > 100) {
            System.out.println("invalid input");
            sc.close();
            return;
        }

        // grade logic
        if (marks >= 90) {
            System.out.println("grade a");
        } else if (marks >= 80) {
            System.out.println("grade b");
        } else if (marks >= 70) {
            System.out.println("grade c");
        } else if (marks >= 60) {
            System.out.println("grade d");
        } else {
            System.out.println("grade f");
        }

        sc.close();
    }
}
