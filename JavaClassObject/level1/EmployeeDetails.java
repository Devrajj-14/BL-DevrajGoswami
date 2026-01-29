package JavaClassObject.level1;

import java.util.Scanner;

/*
this program stores employee details and prints them
uses a basic employee class and simple input output
*/
public class EmployeeDetails {

    static class Employee {
        int id;
        String name;
        double salary;

        Employee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        void display() {
            System.out.println("id " + id);
            System.out.println("name " + name);
            System.out.println("salary " + salary);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter id ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("enter name ");
        String name = sc.nextLine();

        System.out.print("enter salary ");
        double salary = sc.nextDouble();

        // validation
        if (id <= 0 || salary < 0) {
            System.out.println("invalid input");
            sc.close();
            return;
        }

        Employee emp = new Employee(id, name, salary);
        emp.display();

        sc.close();
    }
}
