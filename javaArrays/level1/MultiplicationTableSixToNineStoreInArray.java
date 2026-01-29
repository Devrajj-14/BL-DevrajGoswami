package javaArrays.level1;

import java.util.Scanner;

/*
this program stores multiplication results for a number from 6 to 9
then prints in the format number * i = result
*/
public class MultiplicationTableSixToNineStoreInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number ");
        int number = sc.nextInt();

        int[] results = new int[4];
        int idx = 0;

        // loop to store results from 6 to 9
        for (int i = 6; i <= 9; i++) {
            results[idx] = number * i;
            idx++;
        }

        idx = 0;

        // loop to print using array
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + results[idx]);
            idx++;
        }

        sc.close();
    }
}
