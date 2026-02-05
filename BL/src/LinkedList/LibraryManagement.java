package LinkedList;
import java.util.Locale;

public class LibraryManagement {

    /*
     this class represents one book node in the doubly linked list
     it stores book details and links to the next and previous node
    */
    static class booknode {
        String title;
        String author;
        String genre;
        int bookid;
        boolean available;
        booknode next;
        booknode prev;

        booknode(String title, String author, String genre, int bookid, boolean available) {
            this.title = title;
            this.author = author;
            this.genre = genre;
            this.bookid = bookid;
            this.available = available;
            this.next = null;
            this.prev = null;
        }
    }

    /*
     this class manages the library using a doubly linked list
     it supports add, remove, search, update, display, and count operations
    */
    static class library {
        private booknode head;
        private booknode tail;
        private int size;

        library() {
            this.head = null;
            this.tail = null;
            this.size = 0;
        }

        public int countbooks() {
            // return the current size
            return size;
        }

        public void addfirst(String title, String author, String genre, int bookid, boolean available) {
            // create a new node
            booknode node = new booknode(title, author, genre, bookid, available);

            // if list is empty set both head and tail
            if (head == null) {
                head = node;
                tail = node;
                size++;
                return;
            }

            // link new node before current head
            node.next = head;
            head.prev = node;
            head = node;
            size++;
        }

        public void addlast(String title, String author, String genre, int bookid, boolean available) {
            // create a new node
            booknode node = new booknode(title, author, genre, bookid, available);

            // if list is empty set both head and tail
            if (tail == null) {
                head = node;
                tail = node;
                size++;
                return;
            }

            // link new node after current tail
            tail.next = node;
            node.prev = tail;
            tail = node;
            size++;
        }

        public void addatposition(int position, String title, String author, String genre, int bookid, boolean available) {
            // valid positions are 1 to size + 1
            if (position < 1 || position > size + 1) {
                System.out.println("position is invalid");
                return;
            }

            // if position is 1 add at beginning
            if (position == 1) {
                addfirst(title, author, genre, bookid, available);
                return;
            }

            // if position is size + 1 add at end
            if (position == size + 1) {
                addlast(title, author, genre, bookid, available);
                return;
            }

            // move to the node currently at the given position
            booknode current = head;
            int index = 1;
            while (index < position) {
                current = current.next;
                index++;
            }

            // insert new node before current
            booknode node = new booknode(title, author, genre, bookid, available);
            booknode previous = current.prev;

            previous.next = node;
            node.prev = previous;

            node.next = current;
            current.prev = node;

            size++;
        }

        public void removebybookid(int bookid) {
            // if list is empty nothing to remove
            if (head == null) {
                System.out.println("library is empty");
                return;
            }

            // find the node with matching id
            booknode current = head;
            while (current != null && current.bookid != bookid) {
                current = current.next;
            }

            // if not found print message
            if (current == null) {
                System.out.println("book not found for id " + bookid);
                return;
            }

            // if removing head update head
            if (current == head) {
                head = head.next;
                if (head != null) {
                    head.prev = null;
                } else {
                    // list became empty so tail should also be null
                    tail = null;
                }
                size--;
                System.out.println("book removed for id " + bookid);
                return;
            }

            // if removing tail update tail
            if (current == tail) {
                tail = tail.prev;
                if (tail != null) {
                    tail.next = null;
                } else {
                    // list became empty so head should also be null
                    head = null;
                }
                size--;
                System.out.println("book removed for id " + bookid);
                return;
            }

            // remove from middle by linking neighbors
            booknode left = current.prev;
            booknode right = current.next;

            left.next = right;
            right.prev = left;

            size--;
            System.out.println("book removed for id " + bookid);
        }

        public void updateavailability(int bookid, boolean available) {
            // search by id and update availability
            booknode current = head;
            while (current != null) {
                if (current.bookid == bookid) {
                    current.available = available;
                    System.out.println("availability updated for id " + bookid);
                    return;
                }
                current = current.next;
            }
            System.out.println("book not found for id " + bookid);
        }

        public void searchbytitle(String title) {
            // normalize input for better matching
            String key = safe(title).toLowerCase(Locale.ROOT);

            // search and print matches
            booknode current = head;
            boolean found = false;
            while (current != null) {
                if (safe(current.title).toLowerCase(Locale.ROOT).contains(key)) {
                    printbook(current);
                    found = true;
                }
                current = current.next;
            }

            // show message if no results
            if (!found) {
                System.out.println("no book found by title");
            }
        }

        public void searchbyauthor(String author) {
            // normalize input for better matching
            String key = safe(author).toLowerCase(Locale.ROOT);

            // search and print matches
            booknode current = head;
            boolean found = false;
            while (current != null) {
                if (safe(current.author).toLowerCase(Locale.ROOT).contains(key)) {
                    printbook(current);
                    found = true;
                }
                current = current.next;
            }

            // show message if no results
            if (!found) {
                System.out.println("no book found by author");
            }
        }

        public void displayforward() {
            // traverse from head to tail
            if (head == null) {
                System.out.println("library is empty");
                return;
            }

            booknode current = head;
            while (current != null) {
                printbook(current);
                current = current.next;
            }
        }

        public void displayreverse() {
            // traverse from tail to head using prev pointers
            if (tail == null) {
                System.out.println("library is empty");
                return;
            }

            booknode current = tail;
            while (current != null) {
                printbook(current);
                current = current.prev;
            }
        }

        private static void printbook(booknode b) {
            // print one book in a simple readable way
            System.out.println(
                    "id: " + b.bookid +
                            ", title: " + safe(b.title) +
                            ", author: " + safe(b.author) +
                            ", genre: " + safe(b.genre) +
                            ", available: " + (b.available ? "yes" : "no")
            );
        }

        private static String safe(String s) {
            // avoid null issues while printing and searching
            return s == null ? "" : s.trim();
        }
    }

    /*
     this is the driver class to show how the library methods work
     you can remove this main method if you only want the list implementation
    */
    public static void main(String[] args) {

        // create the library
        library lib = new library();

        // add books at beginning and end
        lib.addfirst("clean code", "robert c. martin", "programming", 101, true);
        lib.addlast("effective java", "joshua bloch", "programming", 102, true);
        lib.addlast("the alchemist", "paulo coelho", "fiction", 103, false);

        // add at specific position
        lib.addatposition(2, "head first java", "kathy sierra", "programming", 104, true);

        // display forward
        System.out.println("books forward");
        lib.displayforward();

        // display reverse
        System.out.println("books reverse");
        lib.displayreverse();

        // search by title
        System.out.println("search by title: java");
        lib.searchbytitle("java");

        // search by author
        System.out.println("search by author: martin");
        lib.searchbyauthor("martin");

        // update availability
        lib.updateavailability(103, true);

        // remove a book by id
        lib.removebybookid(102);

        // count books
        System.out.println("total books: " + lib.countbooks());

        // final display
        System.out.println("final list forward");
        lib.displayforward();
    }
}