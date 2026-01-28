package ConstructorsInstance.level2_instance_vs_class;

import java.util.Scanner;

/*
this program demonstrates class variable instituteName shared by all courses
it also shows a static method to update institute name for all objects
*/
public class OnlineCourseManagementStaticDemo {

    static class Course {
        String courseName;
        int duration;
        double fee;

        static String instituteName = "default institute";

        Course(String courseName, int duration, double fee) {
            this.courseName = courseName;
            this.duration = duration;
            this.fee = fee;
        }

        void displayCourseDetails() {
            System.out.println("institute: " + instituteName);
            System.out.println("course: " + courseName);
            System.out.println("duration: " + duration + " weeks");
            System.out.println("fee: " + fee);
        }

        static void updateInstituteName(String newName) {
            instituteName = newName;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter institute name: ");
        String inst = sc.nextLine();
        Course.updateInstituteName(inst);

        System.out.print("enter course name: ");
        String courseName = sc.nextLine();
        System.out.print("enter duration (weeks): ");
        int duration = sc.nextInt();
        System.out.print("enter fee: ");
        double fee = sc.nextDouble();

        Course c1 = new Course(courseName, duration, fee);

        System.out.println("\ncourse details:");
        c1.displayCourseDetails();

        sc.close();
    }
}
