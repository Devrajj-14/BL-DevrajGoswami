package Inheritance;

/* main file for employee management system */
public class EmployeeManagement{
    public static void main(String[] args) {
        Employee e1 = new Manager("devraj", 1, 90000, 5);
        Employee e2 = new Developer("amit", 2, 80000, "java");
        Employee e3 = new Intern("ria", 3, 20000, 3);

        e1.displayDetails(); // polymorphism
        e2.displayDetails(); // polymorphism
        e3.displayDetails(); // polymorphism
    }
}

/* base class employee */
class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name; // assign name
        this.id = id; // assign id
        this.salary = salary; // assign salary
    }

    void displayDetails() {
        System.out.println(name + " " + id + " " + salary); // print base
    }
}

/* manager subclass */
class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary); // call parent
        this.teamSize = teamSize; // assign team size
    }

    void displayDetails() {
        System.out.println(name + " " + id + " " + salary + " team " + teamSize); // override print
    }
}

/* developer subclass */
class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary); // call parent
        this.programmingLanguage = programmingLanguage; // assign language
    }

    void displayDetails() {
        System.out.println(name + " " + id + " " + salary + " lang " + programmingLanguage); // override print
    }
}

/* intern subclass */
class Intern extends Employee {
    int durationMonths;

    Intern(String name, int id, double salary, int durationMonths) {
        super(name, id, salary); // call parent
        this.durationMonths = durationMonths; // assign duration
    }

    void displayDetails() {
        System.out.println(name + " " + id + " " + salary + " months " + durationMonths); // override print
    }
}
