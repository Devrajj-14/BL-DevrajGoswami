package javaArrays.level2;

import java.util.Scanner;

/*
this program takes ages and heights for amar akbar anthony
stores in arrays and finds youngest and tallest
*/
public class YoungestAndTallestFriendsUsingArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"amar", "akbar", "anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // loop to take input
        for (int i = 0; i < 3; i++) {
            System.out.print("enter age ");
            ages[i] = sc.nextInt();

            System.out.print("enter height ");
            heights[i] = sc.nextDouble();

            // validation
            if (ages[i] < 0 || heights[i] <= 0) {
                System.out.println("invalid input");
                sc.close();
                return;
            }
        }

        int youngIdx = 0;
        int tallIdx = 0;

        // loop to find youngest and tallest
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngIdx]) youngIdx = i;
            if (heights[i] > heights[tallIdx]) tallIdx = i;
        }

        System.out.println("youngest " + names[youngIdx]);
        System.out.println("tallest " + names[tallIdx]);

        sc.close();
    }
}
