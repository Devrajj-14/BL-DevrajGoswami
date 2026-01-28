package javaContorlFlow.level1;

import java.util.Scanner;

public class RocketCountdownWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter countdown start: ");
        int start = sc.nextInt();

        // validation for negative start
        if (start < 0) {
            System.out.println("Invalid input");
            sc.close();
            return;
        }

        int i = start;

        // while loop countdown
        while (i >= 0) {
            System.out.println(i);
            i--;
        }

        System.out.println("Launch!");
        sc.close();
    }
}
