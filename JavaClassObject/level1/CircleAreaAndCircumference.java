package JavaClassObject.level1;

import java.util.Scanner;

/*
this program calculates area and circumference of a circle
uses a class with radius and simple methods
*/
public class CircleAreaAndCircumference {

    static class Circle {
        double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        double area() {
            return 3.14 * radius * radius;
        }

        double circumference() {
            return 2 * 3.14 * radius;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter radius ");
        double radius = sc.nextDouble();

        // validation
        if (radius <= 0) {
            System.out.println("invalid radius");
            sc.close();
            return;
        }

        Circle c = new Circle(radius);

        System.out.println("area " + c.area());
        System.out.println("circumference " + c.circumference());

        sc.close();
    }
}
