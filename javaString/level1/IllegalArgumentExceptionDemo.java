package javaString.level1;

import java.util.Scanner;

/*
   generates illegalargumentexception using substring(start > end),
   then handles it using try-catch.
*/
public class IllegalArgumentExceptionDemo {

    static void generateException(String text) {
        int start = 5;
        int end = 2;
        System.out.println(text.substring(start, end));
    }

    static void handleException(String text) {
        int start = 5;
        int end = 2;
        try {
            System.out.println(text.substring(start, end));
        } catch (IllegalArgumentException e) {
            System.out.println("caught illegalargumentexception");
        } catch (RuntimeException e) {
            System.out.println("caught runtime exception");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter text: ");
        String text = sc.nextLine();

        System.out.println("generating...");
        try {
            generateException(text);
        } catch (RuntimeException e) {
            System.out.println("program stopped, exception came");
        }

        System.out.println("handling...");
        handleException(text);

        sc.close();
    }
}
