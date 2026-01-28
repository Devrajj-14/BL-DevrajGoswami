package ConstructorsInstance.level3_access_modifiers;

/*
this program demonstrates access modifiers in employee records:
employeeID public, department protected, salary private
salary is updated using a public method
*/
public class EmployeeRecordsAccessModifiers {

    static class Employee {
        public int employeeID;
        protected String department;
        private double salary;

        Employee(int employeeID, String department, double salary) {
            this.employeeID = employeeID;
            this.department = department;
            this.salary = salary;
        }

        public double getSalary() {
            return salary;
        }

        public void updateSalary(double newSalary) {
            if (newSalary > 0) {
                salary = newSalary;
            }
        }
    }

    static class Manager extends Employee {
        String teamName;

        Manager(int employeeID, String department, double salary, String teamName) {
            super(employeeID, department, salary);
            this.teamName = teamName;
        }

        void display() {
            System.out.println("id: " + employeeID); // public
            System.out.println("department: " + department); // protected
            System.out.println("salary: " + getSalary()); // private via getter
            System.out.println("team: " + teamName);
        }
    }

    public static void main(String[] args) {
        Manager m1 = new Manager(10, "it", 60000, "core");
        m1.display();

        m1.updateSalary(72000);
        System.out.println("\nafter salary update:");
        m1.display();
    }
}
