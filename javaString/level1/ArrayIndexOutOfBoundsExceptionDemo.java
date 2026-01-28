package javaString.level1;

import java.util.Scanner;

/*
   generates arrayindexoutofboundsexception by accessing invalid index,
   then handles it using try-catch.
*/
public class ArrayIndexOutOfBoundsExceptionDemo {

    static void generateException(String[] names) {
        int idx = names.length + 1;
        System.out.println(names[idx]);
    }

    static void handleException(String[] names) {
        int idx = names.length + 1;
        try {
            System.out.println(names[idx]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("caught array index out of bounds");
        } catch (RuntimeException e) {
            System.out.println("caught runtime exception");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("how many names: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        System.out.println("generating...");
        try {
            generateException(names);
        } catch (RuntimeException e) {
            System.out.println("program stopped, exception came");
        }

        System.out.println("handling...");
        handleException(names);

        sc.close();
    }
}
