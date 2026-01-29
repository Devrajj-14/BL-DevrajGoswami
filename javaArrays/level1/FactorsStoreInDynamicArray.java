package javaArrays.level1;

import java.util.Scanner;

/*
this program finds factors of a number and stores them in a dynamic array
starts with size 10 and grows when needed
*/
public class FactorsStoreInDynamicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("invalid input");
            sc.close();
            return;
        }

        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // loop to find factors and store
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // if array full then grow
                if (index == maxFactor) {
                    maxFactor = maxFactor * 2;

                    int[] temp = new int[maxFactor];

                    // copy old values
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }

                    factors = temp;
                }

                factors[index] = i;
                index++;
            }
        }

        // loop to print only stored factors
        for (int i = 0; i < index; i++) {
            System.out.println(factors[i]);
        }

        sc.close();
    }
}
