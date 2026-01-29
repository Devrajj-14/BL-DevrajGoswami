package javaArrays.level1;

import java.util.Scanner;

/*
this program takes age of 10 students in an array
then checks voting eligibility with simple rules
*/
public class VotingEligibilityForTenStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ages = new int[10];

        // loop to take input and decide for each student
        for (int i = 0; i < ages.length; i++) {
            System.out.print("enter age ");
            ages[i] = sc.nextInt();

            // negative age is invalid
            if (ages[i] < 0) {
                System.out.println("invalid age");
            } else if (ages[i] >= 18) {
                System.out.println("the student with the age " + ages[i] + " can vote");
            } else {
                System.out.println("the student with the age " + ages[i] + " cannot vote");
            }
        }

        sc.close();
    }
}
