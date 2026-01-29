package javaArrays.level2;

import java.util.Scanner;

/*
this program stores all digits of a number in a dynamic array
starts with 10 and grows by 10 when needed
then finds largest and second largest digit
*/
public class LargestAndSecondLargestDigitDynamicSize {
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
            // if full then grow by 10
            if (index == maxDigit) {
                maxDigit = maxDigit + 10;

                int[] temp = new int[maxDigit];

                // copy existing digits
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                digits = temp;
            }

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
