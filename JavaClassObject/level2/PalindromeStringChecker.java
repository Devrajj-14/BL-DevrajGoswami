package JavaClassObject.level2;

import java.util.Scanner;

/*
this program checks if a string is palindrome
compares characters from start and end
*/
public class PalindromeStringChecker {

    public static boolean isPalindrome(String s) {
        // two pointer logic
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter string ");
        String s = sc.nextLine();

        boolean res = isPalindrome(s);

        if (res) System.out.println("palindrome");
        else System.out.println("not palindrome");

        sc.close();
    }
}
