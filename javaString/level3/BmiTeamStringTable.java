package javaString.level3;
import java.util.*;

public class BmiTeamStringTable {
    static String status(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        if (bmi <= 24.9) return "Normal";
        if (bmi <= 39.9) return "Overweight";
        return "Obese";
    }

    static String[][] calc(double[][] hw) {
        String[][] out = new String[hw.length][4];
        for (int i = 0; i < hw.length; i++) {
            double w = hw[i][0];
            double cm = hw[i][1];
            double m = cm / 100.0;
            double bmi = w / (m * m);

            out[i][0] = String.format("%.0f", cm);
            out[i][1] = String.format("%.1f", w);
            out[i][2] = String.format("%.2f", bmi);
            out[i][3] = status(bmi);
        }
        return out;
    }

    static void show(String[][] a) {
        System.out.printf("%-8s %-8s %-8s %-12s%n", "Height", "Weight", "BMI", "Status");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%-8s %-8s %-8s %-12s%n", a[i][0], a[i][1], a[i][2], a[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] hw = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.println("weight");
            hw[i][0] = sc.nextDouble();
            System.out.println("height_cm");
            hw[i][1] = sc.nextDouble();
        }

        String[][] res = calc(hw);
        show(res);
        sc.close();
    }
}
