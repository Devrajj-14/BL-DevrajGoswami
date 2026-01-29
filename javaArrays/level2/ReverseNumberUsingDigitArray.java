package javaArrays.level2;

import java.util.Scanner;

/*
this program stores digits of a number in an array
then creates another array in reverse order and prints it
*/
public class ReverseNumberUsingDigitArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number ");
        long number = sc.nextLong();

        if (number < 0) number = -number;

        if (number == 0) {
            System.out.println("reverse 0");
            sc.close();
            return;
        }

        // count digits
        long temp = number;
        int count = 0;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        int[] digits = new int[count];

        // store digits
        for (int i = 0; i < count; i++) {
            digits[i] = (int) (number % 10);
            number = number / 10;
        }

        int[] reversed = new int[count];

        // loop to reverse array
        for (int i = 0; i < count; i++) {
            reversed[i] = digits[count - 1 - i];
        }

        // print reverse number from array
        System.out.print("reverse ");
        for (int i = 0; i < reversed.length; i++) {
            System.out.print(reversed[i]);
        }

        System.out.println();
        sc.close();
    }
}
