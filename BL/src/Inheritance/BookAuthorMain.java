package Inheritance;

/* main file for book and author single inheritance */
public class BookAuthorMain {
    public static void main(String[] args) {
        Author a = new Author("clean code", 2008, "robert martin", "software craft");
        a.displayInfo(); // show combined info
    }
}

/* superclass book */
class Book {
    String title;
    int publicationYear;

    Book(String title, int publicationYear) {
        this.title = title; // assign title
        this.publicationYear = publicationYear; // assign year
    }

    void displayInfo() {
        System.out.println("book " + title + " " + publicationYear); // print book info
    }
}

/* subclass author extends book as asked */
class Author extends Book {
    String name;
    String bio;

    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); // call parent
        this.name = name; // assign author name
        this.bio = bio; // assign bio
    }

    void displayInfo() {
        System.out.println("book " + title + " " + publicationYear + " author " + name + " bio " + bio); // override
    }
}
