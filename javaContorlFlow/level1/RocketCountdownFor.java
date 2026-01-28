package javaContorlFlow.level1;

import java.util.Scanner;

public class RocketCountdownFor {
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

        // for loop countdown
        for (int i = start; i >= 0; i--) {
            System.out.println(i);
        }

        System.out.println("Launch!");
        sc.close();
    }
}
