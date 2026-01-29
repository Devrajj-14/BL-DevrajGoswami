package javaArrays.level2;

import java.util.Scanner;

/*
this program calculates bmi for a team using separate arrays
stores weight height bmi and status for each person
*/
public class BmiForTeamUsingArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number of persons ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("invalid input");
            sc.close();
            return;
        }

        double[] weight = new double[n];
        double[] heightCm = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // loop to take input
        for (int i = 0; i < n; i++) {
            System.out.print("enter weight ");
            weight[i] = sc.nextDouble();

            System.out.print("enter height in cm ");
            heightCm[i] = sc.nextDouble();

            // validation and retry
            if (weight[i] <= 0 || heightCm[i] <= 0) {
                System.out.println("invalid input");
                i--;
            }
        }

        // loop to calculate bmi and status
        for (int i = 0; i < n; i++) {
            double h = heightCm[i] / 100.0;
            bmi[i] = weight[i] / (h * h);

            // status check
            if (bmi[i] < 18.5) status[i] = "underweight";
            else if (bmi[i] < 25) status[i] = "normal";
            else if (bmi[i] < 30) status[i] = "overweight";
            else status[i] = "obese";
        }

        // loop to display
        for (int i = 0; i < n; i++) {
            System.out.println("person " + (i + 1) + " weight " + weight[i] + " height " + heightCm[i] + " bmi " + bmi[i] + " status " + status[i]);
        }

        sc.close();
    }
}
