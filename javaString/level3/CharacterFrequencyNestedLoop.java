package javaString.level3;
import java.util.*;

public class CharacterFrequencyNestedLoop {
    static String[] freqList(String text) {
        char[] ch = text.toCharArray();
        int[] f = new int[ch.length];

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '0') continue;
            f[i] = 1;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    f[i]++;
                    ch[j] = '0';
                }
            }
        }

        int c = 0;
        for (int i = 0; i < ch.length; i++) if (ch[i] != '0') c++;

        String[] out = new String[c];
        int k = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != '0') {
                out[k] = ch[i] + " " + f[i];
                k++;
            }
        }
        return out;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("text");
        String text = sc.nextLine();

        String[] ans = freqList(text);
        for (int i = 0; i < ans.length; i++) System.out.println(ans[i]);
        sc.close();
    }
}
