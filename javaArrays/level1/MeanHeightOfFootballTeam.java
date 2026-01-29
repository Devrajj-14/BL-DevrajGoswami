package javaArrays.level1;

import java.util.Scanner;

/*
this program takes 11 heights and finds mean height
mean is sum of heights divided by 11
*/
public class MeanHeightOfFootballTeam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] heights = new double[11];
        double sum = 0.0;

        // loop to take height input and add sum
        for (int i = 0; i < heights.length; i++) {
            System.out.print("enter height ");
            heights[i] = sc.nextDouble();

            // basic validation
            if (heights[i] <= 0) {
                System.out.println("invalid height");
                sc.close();
                return;
            }

            sum += heights[i];
        }

        double mean = sum / heights.length;

        System.out.println("mean height " + mean);

        sc.close();
    }
}
