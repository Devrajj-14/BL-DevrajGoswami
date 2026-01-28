package javaString.level2;
import java.util.*;

public class StudentVotingEligibilityTable {
    static int[] makeAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = (int)(Math.random() * 90) - 10;
        }
        return ages;
    }

    static String[][] eligibility(int[] ages) {
        String[][] out = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            out[i][0] = String.valueOf(ages[i]);
            boolean canVote = ages[i] >= 18;
            if (ages[i] < 0) canVote = false;
            out[i][1] = String.valueOf(canVote);
        }
        return out;
    }

    static void show(String[][] a) {
        System.out.printf("%-10s %-10s%n", "Age", "CanVote");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%-10s %-10s%n", a[i][0], a[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("students");
        int n = sc.nextInt();

        int[] ages = makeAges(n);
        String[][] table = eligibility(ages);
        show(table);
        sc.close();
    }
}
