package ConstructorsInstance.level1_constructors;

import java.util.Scanner;

/*
this program simulates a library book borrow system
a book has availability, and borrowBook() updates it
*/
public class LibraryBookBorrowSystem {

    static class Book {
        String title;
        String author;
        double price;
        boolean available;

        Book() {
            this.title = "unknown";
            this.author = "unknown";
            this.price = 0.0;
            this.available = true;
        }

        Book(String title, String author, double price, boolean available) {
            this.title = title;
            this.author = author;
            this.price = price;
            this.available = available;
        }

        void borrowBook() {
            if (available) {
                available = false;
                System.out.println("borrow successful");
            } else {
                System.out.println("book is already borrowed");
            }
        }

        void display() {
            System.out.println("title: " + title);
            System.out.println("author: " + author);
            System.out.println("price: " + price);
            System.out.println("available: " + available);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter title: ");
        String title = sc.nextLine();
        System.out.print("enter author: ");
        String author = sc.nextLine();
        System.out.print("enter price: ");
        double price = sc.nextDouble();

        Book book = new Book(title, author, price, true);

        System.out.println("\nbook details:");
        book.display();

        System.out.println("\ntrying to borrow...");
        book.borrowBook();

        System.out.println("\nafter borrow:");
        book.display();

        sc.close();
    }
}
