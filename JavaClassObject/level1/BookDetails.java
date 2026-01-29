package JavaClassObject.level1;

import java.util.Scanner;

/*
this program stores book details using a simple class
takes input and prints the details
*/
public class BookDetails {

    static class Book {
        String title;
        String author;
        double price;

        Book(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        void display() {
            System.out.println("title " + title);
            System.out.println("author " + author);
            System.out.println("price " + price);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter title ");
        String title = sc.nextLine();

        System.out.print("enter author ");
        String author = sc.nextLine();

        System.out.print("enter price ");
        double price = sc.nextDouble();

        // basic validation
        if (price < 0) {
            System.out.println("invalid price");
            sc.close();
            return;
        }

        Book book = new Book(title, author, price);
        book.display();

        sc.close();
    }
}
