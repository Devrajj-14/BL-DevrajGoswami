package javaString.level2;
import java.util.*;

public class TrimSpacesUsingCharAt {
    static int[] trimPoints(String text) {
        int n = text.length();
        int s = 0;
        while (s < n && text.charAt(s) == ' ') s++;
        int e = n - 1;
        while (e >= 0 && text.charAt(e) == ' ') e--;
        if (s > e) return new int[]{0, 0};
        return new int[]{s, e + 1};
    }

    static String subCharAt(String text, int start, int end) {
        String out = "";
        for (int i = start; i < end; i++) out += text.charAt(i);
        return out;
    }

    static boolean same(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("text");
        String text = sc.nextLine();

        int[] p = trimPoints(text);
        String a = subCharAt(text, p[0], p[1]);
        String b = text.trim();

        System.out.println(same(a, b));
        sc.close();
    }
}
