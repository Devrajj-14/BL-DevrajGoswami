package ConstructorsInstance.level1_constructors;

import java.util.Scanner;

/*
this program shows a copy constructor
it clones an existing person's data into a new person object
*/
public class PersonCopyConstructor {

    static class Person {
        String name;
        int age;

        Person() {
            this.name = "unknown";
            this.age = 0;
        }

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // copy constructor
        Person(Person other) {
            this.name = other.name;
            this.age = other.age;
        }

        void display() {
            System.out.println("name: " + name);
            System.out.println("age: " + age);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter name: ");
        String name = sc.nextLine();
        System.out.print("enter age: ");
        int age = sc.nextInt();

        Person p1 = new Person(name, age);
        Person p2 = new Person(p1); // copied

        System.out.println("\noriginal person:");
        p1.display();

        System.out.println("\ncopied person:");
        p2.display();

        sc.close();
    }
}
