package ConstructorsInstance.level1_constructors;

import java.util.Scanner;

/*
this program demonstrates constructor chaining using this()
it initializes radius with default value or user-provided value
*/
public class CircleConstructorChaining {

    static class Circle {
        double radius;

        // default constructor
        Circle() {
            this(1.0); // chaining to parameterized constructor
        }

        // parameterized constructor
        Circle(double radius) {
            this.radius = radius;
        }

        double area() {
            return Math.PI * radius * radius;
        }

        double circumference() {
            return 2 * Math.PI * radius;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circle c1 = new Circle();
        System.out.println("default radius area: " + c1.area());
        System.out.println("default radius circumference: " + c1.circumference());

        System.out.print("\nenter radius: ");
        double r = sc.nextDouble();

        Circle c2 = new Circle(r);
        System.out.println("area: " + c2.area());
        System.out.println("circumference: " + c2.circumference());

        sc.close();
    }
}
