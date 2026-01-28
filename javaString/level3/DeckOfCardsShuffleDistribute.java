package javaString.level3;
import java.util.*;

public class DeckOfCardsShuffleDistribute {
    static String[] initDeck(String[] suits, String[] ranks) {
        int n = suits.length * ranks.length;
        String[] deck = new String[n];
        int k = 0;

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[k] = ranks[j] + " of " + suits[i];
                k++;
            }
        }
        return deck;
    }

    static void shuffle(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int r = i + (int)(Math.random() * (n - i));
            String t = deck[i];
            deck[i] = deck[r];
            deck[r] = t;
        }
    }

    static String[][] deal(String[] deck, int cards, int players) {
        if (players <= 0) return null;
        if (cards > deck.length) return null;
        if (cards % players != 0) return null;

        int per = cards / players;
        String[][] out = new String[players][per];

        int k = 0;
        for (int p = 0; p < players; p++) {
            for (int c = 0; c < per; c++) {
                out[p][c] = deck[k];
                k++;
            }
        }
        return out;
    }

    static void printPlayers(String[][] p) {
        for (int i = 0; i < p.length; i++) {
            System.out.println("Player " + (i + 1));
            for (int j = 0; j < p[i].length; j++) System.out.println(p[i][j]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

        String[] deck = initDeck(suits, ranks);
        shuffle(deck);

        System.out.println("cards");
        int cards = sc.nextInt();
        System.out.println("players");
        int players = sc.nextInt();

        String[][] p = deal(deck, cards, players);
        if (p == null) {
            System.out.println("no");
            sc.close();
            return;
        }
        printPlayers(p);
        sc.close();
    }
}
