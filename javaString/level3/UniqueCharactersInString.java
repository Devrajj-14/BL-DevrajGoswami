package javaString.level3;
import java.util.*;

public class UniqueCharactersInString {
    static int myLen(String text) {
        int i = 0;
        while (true) {
            try {
                text.charAt(i);
                i++;
            } catch (RuntimeException e) {
                break;
            }
        }
        return i;
    }

    static char[] uniqueChars(String text) {
        int n = myLen(text);
        char[] tmp = new char[n];
        int k = 0;

        for (int i = 0; i < n; i++) {
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

    static void show(char[] arr) {
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("text");
        String text = sc.nextLine();
        show(uniqueChars(text));
        sc.close();
    }
}
