package javaArrays.level2;

import java.util.Scanner;

/*
this program calculates bmi for a team using 2d array
stores weight height and bmi in personData and stores status in another array
*/
public class BmiForTeamUsing2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number of persons ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("invalid input");
            sc.close();
            return;
        }

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // loop to take input with retry
        for (int i = 0; i < number; i++) {
            System.out.print("enter weight ");
            double w = sc.nextDouble();

            System.out.print("enter height in cm ");
            double hcm = sc.nextDouble();

            // validate
            if (w <= 0 || hcm <= 0) {
                System.out.println("invalid input");
                i--;
                continue;
            }

            personData[i][0] = w;
            personData[i][1] = hcm;
        }

        // loop to calculate bmi and status
        for (int i = 0; i < number; i++) {
            double w = personData[i][0];
            double h = personData[i][1] / 100.0;

            personData[i][2] = w / (h * h);

            // status logic
            if (personData[i][2] < 18.5) weightStatus[i] = "underweight";
            else if (personData[i][2] < 25) weightStatus[i] = "normal";
            else if (personData[i][2] < 30) weightStatus[i] = "overweight";
            else weightStatus[i] = "obese";
        }

        // loop to display
        for (int i = 0; i < number; i++) {
            System.out.println("person " + (i + 1) + " weight " + personData[i][0] + " height " + personData[i][1] + " bmi " + personData[i][2] + " status " + weightStatus[i]);
        }

        sc.close();
    }
}
