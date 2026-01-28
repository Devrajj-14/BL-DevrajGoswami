package javaString.level2;
import java.util.*;

public class SplitWordsCustomVsSplitMethod {
    static int myLen(String text) {
        int count = 0;
        while (true) {
            try {
                text.charAt(count);
                count++;
            } catch (RuntimeException e) {
                break;
            }
        }
        return count;
    }

    static int countWords(String text) {
        int n = myLen(text);
        int i = 0;
        while (i < n && text.charAt(i) == ' ') i++;
        if (i >= n) return 0;

        int words = 1;
        for (; i < n; i++) {
            if (text.charAt(i) == ' ' && i + 1 < n && text.charAt(i + 1) != ' ') words++;
        }
        return words;
    }

    static String[] splitCustom(String text) {
        int n = myLen(text);
        int words = countWords(text);
        String[] out = new String[words];
        int k = 0;

        int i = 0;
        while (i < n && text.charAt(i) == ' ') i++;

        String cur = "";
        for (; i < n; i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                cur += ch;
            } else {
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

    static boolean sameArr(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("text");
        String text = sc.nextLine();

        String[] a = splitCustom(text);
        String[] b = text.trim().split("\\s+");

        System.out.println(sameArr(a, b));
        sc.close();
    }
}
