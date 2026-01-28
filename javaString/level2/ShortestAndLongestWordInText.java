package javaString.level2;
import java.util.*;

public class ShortestAndLongestWordInText {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("text");
        String text = sc.nextLine();

        String[] words = splitCustom(text);
        if (words.length == 0) {
            System.out.println("no words");
            sc.close();
            return;
        }

        String shortest = words[0];
        String longest = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < shortest.length()) shortest = words[i];
            if (words[i].length() > longest.length()) longest = words[i];
        }

        System.out.println("shortest " + shortest);
        System.out.println("longest " + longest);
        sc.close();
    }
}
