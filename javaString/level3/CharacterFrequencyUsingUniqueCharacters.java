package javaString.level3;
import java.util.*;

public class CharacterFrequencyUsingUniqueCharacters {
    static char[] uniqueChars(String text) {
        char[] tmp = new char[text.length()];
        int k = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean ok = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                tmp[k] = ch;
                k++;
            }
        }

        char[] out = new char[k];
        for (int i = 0; i < k; i++) out[i] = tmp[i];
        return out;
    }

    static String[][] freqUsingUnique(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) freq[(int) text.charAt(i)]++;

        char[] u = uniqueChars(text);
        String[][] out = new String[u.length][2];

        for (int i = 0; i < u.length; i++) {
            out[i][0] = String.valueOf(u[i]);
            out[i][1] = String.valueOf(freq[(int) u[i]]);
        }
        return out;
    }

    static void show(String[][] a) {
        System.out.printf("%-8s %-8s%n", "Char", "Freq");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%-8s %-8s%n", a[i][0], a[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("text");
        String text = sc.nextLine();
        show(freqUsingUnique(text));
        sc.close();
    }
}
