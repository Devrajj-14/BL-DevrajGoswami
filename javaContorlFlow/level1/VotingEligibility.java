package javaContorlFlow.level1;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        // validation for negative age
        if (age < 0) {
            System.out.println("Invalid input");
            sc.close();
            return;
        }

        // if-else for voting eligibility
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }

        sc.close();
    }
}
