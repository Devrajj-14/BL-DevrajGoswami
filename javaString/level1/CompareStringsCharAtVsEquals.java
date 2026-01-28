package javaString.level1;

import java.util.Scanner;

/*
   compares two strings using charAt() and checks the same using equals().
   prints both results and also prints if both methods gave same answer.
*/
public class CompareStringsCharAtVsEquals {

    static boolean compareByCharAt(String a, String b) {
        if (a.length() != b.length()) return false;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter text 1: ");
        String a = sc.next();
        System.out.print("enter text 2: ");
        String b = sc.next();

        boolean res1 = compareByCharAt(a, b);
        boolean res2 = a.equals(b);

        System.out.println("charAt compare: " + res1);
        System.out.println("equals compare : " + res2);
        System.out.println("same result?   : " + (res1 == res2));

        sc.close();
    }
}
