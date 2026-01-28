package ConstructorsInstance.level1_constructors;

import java.util.Scanner;

/*
this program models a car rental system using constructors
it calculates total cost based on rental days and a simple per day rate
*/
public class CarRentalSystem {

    static class CarRental {
        String customerName;
        String carModel;
        int rentalDays;

        CarRental() {
            this.customerName = "customer";
            this.carModel = "basic";
            this.rentalDays = 1;
        }

        CarRental(String customerName, String carModel, int rentalDays) {
            this.customerName = customerName;
            this.carModel = carModel;
            this.rentalDays = rentalDays;
        }

        double totalCost() {
            double ratePerDay = 1200.0; // simple fixed rate
            return rentalDays * ratePerDay;
        }

        void display() {
            System.out.println("customer: " + customerName);
            System.out.println("car model: " + carModel);
            System.out.println("rental days: " + rentalDays);
            System.out.println("total cost: " + totalCost());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter customer name: ");
        String name = sc.nextLine();
        System.out.print("enter car model: ");
        String model = sc.nextLine();
        System.out.print("enter rental days: ");
        int days = sc.nextInt();

        CarRental rental = new CarRental(name, model, days);

        System.out.println("\nrental details:");
        rental.display();

        sc.close();
    }
}
