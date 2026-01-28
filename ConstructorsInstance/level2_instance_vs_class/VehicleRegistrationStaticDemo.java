package ConstructorsInstance.level2_instance_vs_class;

import java.util.Scanner;

/*
this program shows a class variable registrationFee shared by all vehicles
and a static method to update it for everyone
*/
public class VehicleRegistrationStaticDemo {

    static class Vehicle {
        String ownerName;
        String vehicleType;

        static double registrationFee = 1500.0;

        Vehicle(String ownerName, String vehicleType) {
            this.ownerName = ownerName;
            this.vehicleType = vehicleType;
        }

        void displayVehicleDetails() {
            System.out.println("owner: " + ownerName);
            System.out.println("type: " + vehicleType);
            System.out.println("registration fee: " + registrationFee);
        }

        static void updateRegistrationFee(double newFee) {
            registrationFee = newFee;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter owner name: ");
        String owner = sc.nextLine();
        System.out.print("enter vehicle type: ");
        String type = sc.nextLine();

        System.out.print("enter new registration fee (or 0 to keep same): ");
        double fee = sc.nextDouble();
        if (fee > 0) {
            Vehicle.updateRegistrationFee(fee);
        }

        Vehicle v1 = new Vehicle(owner, type);

        System.out.println("\nvehicle details:");
        v1.displayVehicleDetails();

        sc.close();
    }
}
