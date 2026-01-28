package javaString.level3;
import java.util.*;

public class AnagramCheck {
    static boolean anagram(String a, String b) {
        if (a.length() != b.length()) return false;

        int[] fa = new int[256];
        int[] fb = new int[256];

        for (int i = 0; i < a.length(); i++) {
            fa[(int) a.charAt(i)]++;
            fb[(int) b.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) {
            if (fa[i] != fb[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("text1");
        String a = sc.nextLine();
        System.out.println("text2");
        String b = sc.nextLine();
        System.out.println(anagram(a, b));
        sc.close();
    }
}
