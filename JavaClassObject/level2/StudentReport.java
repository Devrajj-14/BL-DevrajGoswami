package JavaClassObject.level2;

import java.util.Scanner;

/*
this program creates a student report with pcm marks
calculates total and percentage and prints it
*/
public class StudentReport {

    static class Student {
        String name;
        int phy;
        int chem;
        int math;

        Student(String name, int phy, int chem, int math) {
            this.name = name;
            this.phy = phy;
            this.chem = chem;
            this.math = math;
        }

        int total() {
            return phy + chem + math;
        }

        double percentage() {
            return (total() / 300.0) * 100.0;
        }

        void display() {
            System.out.println("name " + name);
            System.out.println("total " + total());
            System.out.println("percentage " + percentage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter name ");
        String name = sc.nextLine();

        System.out.print("enter physics ");
        int phy = sc.nextInt();

        System.out.print("enter chemistry ");
        int chem = sc.nextInt();

        System.out.print("enter maths ");
        int math = sc.nextInt();

        // validation
        if (phy < 0 || chem < 0 || math < 0) {
            System.out.println("invalid marks");
            sc.close();
            return;
        }

        Student s = new Student(name, phy, chem, math);
        s.display();

        sc.close();
    }
}
