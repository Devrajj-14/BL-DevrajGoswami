package javaString.level1;

import java.util.Scanner;

/*
   creates substring using charAt() loop and compares with built-in substring().
*/
public class SubstringUsingCharAtVsSubstring {

    static String makeSubstringByCharAt(String text, int start, int end) {
        String out = "";
        for (int i = start; i < end; i++) {
            out += text.charAt(i); // building substring one char at a time
        }
        return out;
    }

    static boolean sameText(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter text: ");
        String text = sc.next();
        System.out.print("start index: ");
        int start = sc.nextInt();
        System.out.print("end index: ");
        int end = sc.nextInt();

        String a = makeSubstringByCharAt(text, start, end);
        String b = text.substring(start, end);

        System.out.println("custom substring : " + a);
        System.out.println("built-in substring: " + b);
        System.out.println("same?            : " + sameText(a, b));

        sc.close();
    }
}
