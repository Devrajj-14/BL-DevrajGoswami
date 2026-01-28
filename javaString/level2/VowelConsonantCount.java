package javaString.level2;
import java.util.*;

public class VowelConsonantCount {
    static char toLowerChar(char ch) {
        if (ch >= 'A' && ch <= 'Z') return (char)(ch + 32);
        return ch;
    }

    static String type(char ch) {
        ch = toLowerChar(ch);
        if (ch < 'a' || ch > 'z') return "Not a Letter";
        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') return "Vowel";
        return "Consonant";
    }

    static int[] countVC(String text) {
        int v = 0, c = 0;
        for (int i = 0; i < text.length(); i++) {
            String t = type(text.charAt(i));
            if (t.equals("Vowel")) v++;
            else if (t.equals("Consonant")) c++;
        }
        return new int[]{v, c};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("text");
        String text = sc.nextLine();
        int[] res = countVC(text);
        System.out.println("vowels " + res[0]);
        System.out.println("consonants " + res[1]);
        sc.close();
    }
}
