package javaArrays.level1;

import java.util.Scanner;

/*
this program stores up to 10 double values
stops early if user enters 0 or negative
then prints stored numbers and the total sum
*/
public class StoreUpToTenNumbersUntilStopAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] values = new double[10];
        int index = 0;

        // infinite loop for input until stop condition
        while (true) {
            System.out.print("enter number ");
            double n = sc.nextDouble();

            // stop condition
            if (n <= 0) break;

            // stop if array is full
            if (index == values.length) break;

            values[index] = n;
            index++;
        }

        double total = 0.0;

        // loop to print stored values and add to total
        for (int i = 0; i < index; i++) {
            System.out.println("number " + values[i]);
            total += values[i];
        }

        System.out.println("total " + total);

        sc.close();
    }
}
