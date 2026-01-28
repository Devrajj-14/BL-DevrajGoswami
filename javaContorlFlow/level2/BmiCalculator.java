package javaContorlFlow.level2;

import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter weight in kg ");
        double weight = sc.nextDouble();

        System.out.print("enter height in meters ");
        double height = sc.nextDouble();

        // validation for wrong inputs
        if (weight <= 0 || height <= 0) {
            System.out.println("invalid input");
            sc.close();
            return;
        }

        double bmi = weight / (height * height);

        // bmi category logic
        if (bmi < 18.5) {
            System.out.println("bmi " + bmi);
            System.out.println("category underweight");
        } else if (bmi < 25) {
            System.out.println("bmi " + bmi);
            System.out.println("category normal");
        } else if (bmi < 30) {
            System.out.println("bmi " + bmi);
            System.out.println("category overweight");
        } else {
            System.out.println("bmi " + bmi);
            System.out.println("category obese");
        }

        sc.close();
    }
}
