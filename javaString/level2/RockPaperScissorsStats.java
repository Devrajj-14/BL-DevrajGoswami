package javaString.level2;
import java.util.*;

public class RockPaperScissorsStats {
    static String compChoice() {
        int r = (int)(Math.random() * 3);
        if (r == 0) return "rock";
        if (r == 1) return "paper";
        return "scissors";
    }

    static int winner(String user, String comp) {
        if (user.equals(comp)) return 0;
        if (user.equals("rock") && comp.equals("scissors")) return 1;
        if (user.equals("paper") && comp.equals("rock")) return 1;
        if (user.equals("scissors") && comp.equals("paper")) return 1;
        return -1;
    }

    static String[][] statsTable(int games, int userWin, int compWin, int draw) {
        String[][] out = new String[3][3];
        out[0][0] = "PlayerWins";
        out[0][1] = String.valueOf(userWin);
        out[0][2] = String.format("%.2f", (games == 0 ? 0.0 : (userWin * 100.0 / games)));

        out[1][0] = "ComputerWins";
        out[1][1] = String.valueOf(compWin);
        out[1][2] = String.format("%.2f", (games == 0 ? 0.0 : (compWin * 100.0 / games)));

        out[2][0] = "Draws";
        out[2][1] = String.valueOf(draw);
        out[2][2] = String.format("%.2f", (games == 0 ? 0.0 : (draw * 100.0 / games)));
        return out;
    }

    static void showGames(String[][] games) {
        System.out.printf("%-8s %-12s %-12s %-10s%n", "Game", "Player", "Computer", "Result");
        for (int i = 0; i < games.length; i++) {
            System.out.printf("%-8s %-12s %-12s %-10s%n", games[i][0], games[i][1], games[i][2], games[i][3]);
        }
    }

    static void showStats(String[][] a) {
        System.out.printf("%-15s %-10s %-10s%n", "Type", "Count", "Percent");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%-15s %-10s %-10s%n", a[i][0], a[i][1], a[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("games");
        int n = sc.nextInt();

        String[][] gameTable = new String[n][4];
        int userWin = 0, compWin = 0, draw = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("choice rock/paper/scissors");
            String user = sc.next().toLowerCase();
            String comp = compChoice();
            int w = winner(user, comp);

            String res = "Draw";
            if (w == 1) { res = "Player"; userWin++; }
            else if (w == -1) { res = "Computer"; compWin++; }
            else draw++;

            gameTable[i][0] = String.valueOf(i + 1);
            gameTable[i][1] = user;
            gameTable[i][2] = comp;
            gameTable[i][3] = res;
        }

        showGames(gameTable);
        String[][] stats = statsTable(n, userWin, compWin, draw);
        showStats(stats);
        sc.close();
    }
}
