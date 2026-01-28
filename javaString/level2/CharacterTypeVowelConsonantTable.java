package javaString.level2;
import java.util.*;

public class CharacterTypeVowelConsonantTable {
    static char toLowerChar(char ch) {
        if (ch >= 'A' && ch <= 'Z') return (char)(ch + 32);
        return ch;
    }

    static String type(char ch) {
        char x = toLowerChar(ch);
        if (x < 'a' || x > 'z') return "Not a Letter";
        if (x=='a'||x=='e'||x=='i'||x=='o'||x=='u') return "Vowel";
        return "Consonant";
    }

    static String[][] table(String text) {
        String[][] out = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            out[i][0] = String.valueOf(text.charAt(i));
            out[i][1] = type(text.charAt(i));
        }
        return out;
    }

    static void show(String[][] a) {
        System.out.printf("%-10s %-15s%n", "Char", "Type");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%-10s %-15s%n", a[i][0], a[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("text");
        String text = sc.nextLine();
        show(table(text));
        sc.close();
    }
}
