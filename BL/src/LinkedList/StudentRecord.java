package LinkedList;


class Student {
    int roll;
    String name;
    int age;
    String grade;
    Student next;

    Student(int r, String n, int a, String g) {
        roll = r;
        name = n;
        age = a;
        grade = g;
        next = null;
    }
}

/*
 * StudentList (Singly Linked List)
 * Manages student nodes using head reference.
 */
class StudentList {
    Student head;

    void addFirst(Student s) {
        // link new node to current head
        s.next = head;
        // move head to new node
        head = s;
    }

    void delete(int roll) {
        // if list is empty, stop
        if (head == null) return;

        // if head has the roll, remove head
        if (head.roll == roll) {
            head = head.next;
            return;
        }

        // prev tracks previous node
        Student prev = head;
        // curr tracks current node
        Student curr = head.next;

        while (curr != null) {
            // if found, skip curr
            if (curr.roll == roll) {
                prev.next = curr.next;
                return;
            }
            // move pointers forward
            prev = curr;
            curr = curr.next;
        }
    }

    Student search(int roll) {
        // start from head
        Student temp = head;
        while (temp != null) {
            // check roll match
            if (temp.roll == roll) return temp;
            // move next
            temp = temp.next;
        }
        // not found
        return null;
    }

    void updateGrade(int roll, String newGrade) {
        // find student node
        Student s = search(roll);
        // if found, update
        if (s != null) s.grade = newGrade;
    }

    void display() {
        // start from head
        Student temp = head;
        while (temp != null) {
            // print current node
            System.out.println(temp.roll + " " + temp.name + " " + temp.age + " " + temp.grade);
            // move next
            temp = temp.next;
        }
    }
}

/*
 * Main Driver
 * Demonstrates basic linked list operations.
 */
public class StudentRecord {
    public static void main(String[] args) {
        // create list
        StudentList list = new StudentList();

        // add students at beginning
        list.addFirst(new Student(1, "Devraj", 20, "A"));
        list.addFirst(new Student(2, "Rahul", 21, "B"));

        // display records
        list.display();

        // search a roll number
        System.out.println("Search roll 1: " + (list.search(1) != null ? "Found" : "Not Found"));

        // update grade for roll 1
        list.updateGrade(1, "A+");

        // delete roll 2
        list.delete(2);

        // final display
        System.out.println("After update and delete:");
        list.display();
    }
}
