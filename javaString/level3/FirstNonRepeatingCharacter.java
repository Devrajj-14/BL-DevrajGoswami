package javaString.level3;
import java.util.*;

public class FirstNonRepeatingCharacter {
    static char firstNonRepeat(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[(int) text.charAt(i)]++;
        }

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[(int) ch] == 1) return ch;
        }
        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("text");
        String text = sc.nextLine();

        char ans = firstNonRepeat(text);
        if (ans == '\0') System.out.println("none");
        else System.out.println(ans);

        sc.close();
    }
}
