package javaString.level1;

import java.util.Scanner;

/*
   generates numberformatexception using integer.parseInt on non-numeric text,
   then handles it using try-catch.
*/
public class NumberFormatExceptionDemo {

    static void generateException(String text) {
        int n = Integer.parseInt(text);
        System.out.println(n);
    }

    static void handleException(String text) {
        try {
            int n = Integer.parseInt(text);
            System.out.println(n);
        } catch (NumberFormatException e) {
            System.out.println("caught numberformatexception");
        } catch (RuntimeException e) {
            System.out.println("caught runtime exception");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number text: ");
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
