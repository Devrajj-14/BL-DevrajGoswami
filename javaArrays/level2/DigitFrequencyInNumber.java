package javaArrays.level2;

import java.util.Scanner;

/*
this program finds frequency of digits in a number
stores digits in an array then counts frequency using a freq array of size 10
*/
public class DigitFrequencyInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number ");
        long number = sc.nextLong();

        if (number < 0) number = -number;

        if (number == 0) {
            System.out.println("digit 0 frequency 1");
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

        int[] freq = new int[10];

        // loop to count frequency
        for (int i = 0; i < digits.length; i++) {
            freq[digits[i]]++;
        }

        // loop to display only digits that appear
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println("digit " + i + " frequency " + freq[i]);
            }
        }

        sc.close();
    }
}
