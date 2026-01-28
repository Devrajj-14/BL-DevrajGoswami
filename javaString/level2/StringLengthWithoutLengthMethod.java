package javaString.level2;
import java.util.*;

public class StringLengthWithoutLengthMethod {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("text");
        String text = sc.next();
        int a = myLen(text);
        int b = text.length();
        System.out.println(a);
        System.out.println(b);
        sc.close();
    }
}
