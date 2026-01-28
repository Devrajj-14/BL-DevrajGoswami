package ConstructorsInstance.level3_access_modifiers;

/*
this program demonstrates access modifiers in a book system:
ISBN public, title protected, author private
author is accessed using getters/setters
*/
public class BookLibraryAccessModifiers {

    static class Book {
        public String ISBN;
        protected String title;
        private String author;

        Book(String ISBN, String title, String author) {
            this.ISBN = ISBN;
            this.title = title;
            this.author = author;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }
    }

    static class EBook extends Book {
        String format;

        EBook(String ISBN, String title, String author, String format) {
            super(ISBN, title, author);
            this.format = format;
        }

        void display() {
            System.out.println("isbn: " + ISBN); // public
            System.out.println("title: " + title); // protected
            System.out.println("author: " + getAuthor()); // private via getter
            System.out.println("format: " + format);
        }
    }

    public static void main(String[] args) {
        EBook b1 = new EBook("978-1", "java basics", "someone", "pdf");
        b1.display();

        b1.setAuthor("updated author");
        System.out.println("\nafter author update:");
        b1.display();
    }
}
