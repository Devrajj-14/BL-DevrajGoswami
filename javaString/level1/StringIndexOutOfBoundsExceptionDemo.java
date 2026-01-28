package javaString.level1;

import java.util.Scanner;

/*
   generates stringindexoutofboundsexception using charAt() with invalid index,
   then handles it using try-catch.
*/
public class StringIndexOutOfBoundsExceptionDemo {

    static void generateException(String text) {
        int idx = text.length() + 2;
        System.out.println(text.charAt(idx));
    }

    static void handleException(String text) {
        int idx = text.length() + 2;
        try {
            System.out.println(text.charAt(idx));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("caught string index out of bounds");
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
