package javaArrays.level1;

import java.util.Scanner;

/*
this program stores fizz buzz results in a string array
then prints each position with the stored value
*/
public class FizzBuzzStoreInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("invalid input");
            sc.close();
            return;
        }

        String[] result = new String[number + 1];

        // loop to fill array from 0 to number
        for (int i = 0; i <= number; i++) {
            if (i != 0 && i % 3 == 0 && i % 5 == 0) {
                result[i] = "fizzbuzz";
            } else if (i != 0 && i % 3 == 0) {
                result[i] = "fizz";
            } else if (i != 0 && i % 5 == 0) {
                result[i] = "buzz";
            } else {
                result[i] = String.valueOf(i);
            }
        }

        // loop to print positions
        for (int i = 1; i <= number; i++) {
            System.out.println("position " + i + " = " + result[i]);
        }

        sc.close();
    }
}
