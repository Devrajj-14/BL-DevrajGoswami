package javaString.level2;
import java.util.*;

public class SplitWordsWithLengths2DArray {
    static String[] splitCustom(String text) {
        int n = text.length();
        int i = 0;
        while (i < n && text.charAt(i) == ' ') i++;
        if (i >= n) return new String[0];

        int words = 1;
        for (int t = i; t < n; t++) {
            if (text.charAt(t) == ' ' && t + 1 < n && text.charAt(t + 1) != ' ') words++;
        }

        String[] out = new String[words];
        int k = 0;
        String cur = "";
        for (; i < n; i++) {
            char ch = text.charAt(i);
            if (ch != ' ') cur += ch;
            else {
                if (cur.length() > 0) {
                    out[k] = cur;
                    k++;
                    cur = "";
                }
            }
        }
        if (cur.length() > 0) out[k] = cur;
        return out;
    }

    static String[][] wordsWithLen(String[] words) {
        String[][] out = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            out[i][0] = words[i];
            out[i][1] = String.valueOf(words[i].length());
        }
        return out;
    }

    static void show(String[][] a) {
        System.out.printf("%-20s %-10s%n", "Word", "Length");
        for (int i = 0; i < a.length; i++) {
            int len = Integer.parseInt(a[i][1]);
            System.out.printf("%-20s %-10d%n", a[i][0], len);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("text");
        String text = sc.nextLine();

        String[] words = splitCustom(text);
        String[][] table = wordsWithLen(words);
        show(table);
        sc.close();
    }
}
