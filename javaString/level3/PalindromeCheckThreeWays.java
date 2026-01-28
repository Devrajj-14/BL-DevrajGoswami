package javaString.level3;
import java.util.*;

public class PalindromeCheckThreeWays {
    static boolean pal1(String t) {
        int i = 0, j = t.length() - 1;
        while (i < j) {
            if (t.charAt(i) != t.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    static boolean pal2(String t, int i, int j) {
        if (i >= j) return true;
        if (t.charAt(i) != t.charAt(j)) return false;
        return pal2(t, i + 1, j - 1);
    }

    static char[] revArr(String t) {
        char[] r = new char[t.length()];
        int k = 0;
        for (int i = t.length() - 1; i >= 0; i--) {
            r[k] = t.charAt(i);
            k++;
        }
        return r;
    }

    static boolean pal3(String t) {
        char[] a = t.toCharArray();
        char[] b = revArr(t);
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("text");
        String t = sc.nextLine();

        System.out.println(pal1(t));
        System.out.println(pal2(t, 0, t.length() - 1));
        System.out.println(pal3(t));

        sc.close();
    }
}
