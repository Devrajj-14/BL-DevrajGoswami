package javaString.level2;
import java.util.*;

public class StudentMarksGradeScorecard {
    static int[][] genPCM(int n) {
        int[][] out = new int[n][3];
        for (int i = 0; i < n; i++) {
            out[i][0] = 10 + (int)(Math.random() * 90);
            out[i][1] = 10 + (int)(Math.random() * 90);
            out[i][2] = 10 + (int)(Math.random() * 90);
        }
        return out;
    }

    static double round2(double x) {
        return Math.round(x * 100.0) / 100.0;
    }

    static double[][] calcTotals(int[][] pcm) {
        double[][] out = new double[pcm.length][4];
        for (int i = 0; i < pcm.length; i++) {
            int p = pcm[i][0], c = pcm[i][1], m = pcm[i][2];
            int total = p + c + m;
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100.0;

            out[i][0] = total;
            out[i][1] = round2(avg);
            out[i][2] = round2(percent);
            out[i][3] = 0;
        }
        return out;
    }

    static String grade(double percent) {
        if (percent >= 80) return "A";
        if (percent >= 70) return "B";
        if (percent >= 60) return "C";
        if (percent >= 50) return "D";
        if (percent >= 40) return "E";
        return "R";
    }

    static String[] grades(double[][] calc) {
        String[] g = new String[calc.length];
        for (int i = 0; i < calc.length; i++) {
            g[i] = grade(calc[i][2]);
        }
        return g;
    }

    static void show(int[][] pcm, double[][] calc, String[] g) {
        System.out.printf("%-8s %-8s %-8s %-8s %-8s %-10s %-8s%n",
                "Stud", "Phy", "Chem", "Math", "Total", "Percent", "Grade");
        for (int i = 0; i < pcm.length; i++) {
            System.out.printf("%-8d %-8d %-8d %-8d %-8.0f %-10.2f %-8s%n",
                    (i + 1), pcm[i][0], pcm[i][1], pcm[i][2], calc[i][0], calc[i][2], g[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("students");
        int n = sc.nextInt();

        int[][] pcm = genPCM(n);
        double[][] calc = calcTotals(pcm);
        String[] g = grades(calc);

        show(pcm, calc, g);
        sc.close();
    }
}
