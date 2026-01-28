package javaString.level1;

import java.util.Arrays;
import java.util.Scanner;

/*
   returns all characters using charAt() into a char array and compares with toCharArray().
*/
public class StringToCharArrayCustomVsBuiltIn {

    static char[] getCharsByCharAt(String text) {
        char[] arr = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }
        return arr;
    }

    static boolean sameArray(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter text: ");
        String text = sc.next();

        char[] a = getCharsByCharAt(text);
        char[] b = text.toCharArray();

        System.out.println("custom  : " + Arrays.toString(a));
        System.out.println("builtin : " + Arrays.toString(b));
        System.out.println("same?   : " + sameArray(a, b));

        sc.close();
    }
}
