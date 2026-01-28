package javaContorlFlow.level2;

import java.util.Scanner;

public class YoungestAndTallestFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter age of friend1 ");
        int age1 = sc.nextInt();
        System.out.print("enter height of friend1 ");
        double h1 = sc.nextDouble();

        System.out.print("enter age of friend2 ");
        int age2 = sc.nextInt();
        System.out.print("enter height of friend2 ");
        double h2 = sc.nextDouble();

        System.out.print("enter age of friend3 ");
        int age3 = sc.nextInt();
        System.out.print("enter height of friend3 ");
        double h3 = sc.nextDouble();

        // validation for negative inputs
        if (age1 < 0 || age2 < 0 || age3 < 0 || h1 <= 0 || h2 <= 0 || h3 <= 0) {
            System.out.println("invalid input");
            sc.close();
            return;
        }

        int youngestAge = age1;
        int youngestFriend = 1;

        // checking youngest
        if (age2 < youngestAge) {
            youngestAge = age2;
            youngestFriend = 2;
        }
        if (age3 < youngestAge) {
            youngestAge = age3;
            youngestFriend = 3;
        }

        double tallestHeight = h1;
        int tallestFriend = 1;

        // checking tallest
        if (h2 > tallestHeight) {
            tallestHeight = h2;
            tallestFriend = 2;
        }
        if (h3 > tallestHeight) {
            tallestHeight = h3;
            tallestFriend = 3;
        }

        System.out.println("youngest friend " + youngestFriend);
        System.out.println("tallest friend " + tallestFriend);

        sc.close();
    }
}
