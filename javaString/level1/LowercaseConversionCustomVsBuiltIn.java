package javaString.level1;

import java.util.Scanner;

/*
   converts whole text to lowercase using charAt + ascii,
   compares with built-in toLowerCase().
*/
public class LowercaseConversionCustomVsBuiltIn {

    static String myLower(String text) {
        String out = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // only convert uppercase letters
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            out += ch;
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

        System.out.print("enter full text: ");
        String text = sc.nextLine();

        String a = myLower(text);
        String b = text.toLowerCase();

        System.out.println("custom : " + a);
        System.out.println("builtin: " + b);
        System.out.println("same?  : " + sameText(a, b));

        sc.close();
    }
}
