package Inheritance;


/* main file for school system */
public class SchoolMain {
    public static void main(String[] args) {
        Person p1 = new Teacher("ram", 35, "math");
        Person p2 = new Student("sita", 16, "10th");

        p1.displayRole(); // teacher
        p2.displayRole(); // student
    }
}

/* base class person */
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name; // assign name
        this.age = age; // assign age
    }

    void displayRole() {
        System.out.println("person"); // base role
    }
}

/* teacher subclass */
class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age); // call parent
        this.subject = subject; // assign subject
    }

    void displayRole() {
        System.out.println("teacher"); // override
    }
}

/* student subclass */
class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age); // call parent
        this.grade = grade; // assign grade
    }

    void displayRole() {
        System.out.println("student"); // override
    }
}
