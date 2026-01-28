package ConstructorsInstance.level1_constructors;

import java.util.Scanner;

/*
this program shows default and parameterized constructors in a book class
it creates books using both constructors and prints the details
*/
public class BookConstructorsDemo {

    static class Book {
        String title;
        String author;
        double price;

        // default constructor
        Book() {
            this.title = "unknown";
            this.author = "unknown";
            this.price = 0.0;
        }

        // parameterized constructor
        Book(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        void display() {
            System.out.println("title: " + title);
            System.out.println("author: " + author);
            System.out.println("price: " + price);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book b1 = new Book();
        System.out.println("default book:");
        b1.display();

        System.out.print("\nenter title: ");
        String title = sc.nextLine();
        System.out.print("enter author: ");
        String author = sc.nextLine();
        System.out.print("enter price: ");
        double price = sc.nextDouble();

        Book b2 = new Book(title, author, price);
        System.out.println("\nparameterized book:");
        b2.display();

        sc.close();
    }
}
