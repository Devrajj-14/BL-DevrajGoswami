package javaString.level3;
import java.util.*;

public class CharacterFrequencyAsciiMethod {
    static String[][] freqTable(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[(int) text.charAt(i)]++;
        }

        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            int idx = (int) text.charAt(i);
            if (freq[idx] > 0) {
                count++;
                freq[idx] = -freq[idx];
            }
        }
        for (int i = 0; i < 256; i++) if (freq[i] < 0) freq[i] = -freq[i];

        String[][] out = new String[count][2];
        int k = 0;
        for (int i = 0; i < text.length(); i++) {
            int idx = (int) text.charAt(i);
            if (freq[idx] > 0) {
                out[k][0] = String.valueOf(text.charAt(i));
                out[k][1] = String.valueOf(freq[idx]);
                k++;
                freq[idx] = 0;
            }
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
        show(freqTable(text));
        sc.close();
    }
}
