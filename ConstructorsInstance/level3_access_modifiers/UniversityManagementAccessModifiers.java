package ConstructorsInstance.level3_access_modifiers;

/*
this program demonstrates access modifiers:
rollNumber is public, name is protected, cgpa is private
cgpa is accessed/updated using public methods
*/
public class UniversityManagementAccessModifiers {

    static class Student {
        public int rollNumber;
        protected String name;
        private double cgpa;

        Student(int rollNumber, String name, double cgpa) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.cgpa = cgpa;
        }

        public double getCgpa() {
            return cgpa;
        }

        public void setCgpa(double cgpa) {
            this.cgpa = cgpa;
        }
    }

    static class PostgraduateStudent extends Student {
        String specialization;

        PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
            super(rollNumber, name, cgpa);
            this.specialization = specialization;
        }

        void display() {
            System.out.println("roll: " + rollNumber);
            System.out.println("name: " + name); // protected access
            System.out.println("cgpa: " + getCgpa()); // private via getter
            System.out.println("specialization: " + specialization);
        }
    }

    public static void main(String[] args) {
        PostgraduateStudent s1 = new PostgraduateStudent(101, "devraj", 8.2, "ai");
        s1.display();

        s1.setCgpa(8.6);
        System.out.println("\nafter updating cgpa:");
        s1.display();
    }
}
