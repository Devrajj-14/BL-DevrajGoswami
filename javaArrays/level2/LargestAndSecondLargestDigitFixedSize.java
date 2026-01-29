package javaArrays.level2;

import java.util.Scanner;

/*
this program stores digits of a number into a fixed size array of 10
if digits are more than 10 extra digits are ignored
then finds largest and second largest digit
*/
public class LargestAndSecondLargestDigitFixedSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number ");
        long number = sc.nextLong();

        if (number < 0) number = -number;

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // loop to extract digits until number becomes 0
        while (number != 0) {
            // if array is full then stop as per fixed size rule
            if (index == maxDigit) break;

            digits[index] = (int) (number % 10);
            index++;
            number = number / 10;
        }

        int largest = 0;
        int secondLargest = 0;

        // loop to find largest and second largest
        for (int i = 0; i < index; i++) {
            int d = digits[i];

            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }

        System.out.println("largest " + largest);
        System.out.println("second largest " + secondLargest);

        sc.close();
    }
}
