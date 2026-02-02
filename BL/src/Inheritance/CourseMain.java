package Inheritance;

/* main file for course system */
public class CourseMain {
    public static void main(String[] args) {
        PaidOnlineCourse c = new PaidOnlineCourse("java", 30, "udemy", true, 3000, 500);
        c.displayCourse(); // show course info
    }
}

/* base class course */
class Course {
    String courseName;
    int duration;

    Course(String courseName, int duration) {
        this.courseName = courseName; // assign name
        this.duration = duration; // assign duration
    }

    void displayCourse() {
        System.out.println(courseName + " " + duration); // base info
    }
}

/* online course extends course */
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration); // call parent
        this.platform = platform; // assign platform
        this.isRecorded = isRecorded; // assign flag
    }
}

/* paid online course extends online course */
class PaidOnlineCourse extends OnlineCourse {
    int fee;
    int discount;

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, int fee, int discount) {
        super(courseName, duration, platform, isRecorded); // call parent
        this.fee = fee; // assign fee
        this.discount = discount; // assign discount
    }

    void displayCourse() {
        System.out.println(courseName + " fee " + (fee - discount)); // final info
    }
}

