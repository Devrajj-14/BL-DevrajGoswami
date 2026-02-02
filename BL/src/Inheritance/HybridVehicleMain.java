package Inheritance;

/* main file for hybrid vehicle system */
public class HybridVehicleMain {
    public static void main(String[] args) {
        PetrolVehicle p = new PetrolVehicle("swift", 180);
        ElectricVehicle e = new ElectricVehicle("tesla", 200);

        p.refuel(); // petrol action
        e.charge(); // electric action
    }
}

/* interface for refuelable vehicles */
interface Refuelable {
    void refuel(); // refuel method
}

/* base class vehicle */
class Vehicle {
    String model;
    int maxSpeed;

    Vehicle(String model, int maxSpeed) {
        this.model = model; // assign model
        this.maxSpeed = maxSpeed; // assign speed
    }
}

/* petrol vehicle */
class PetrolVehicle extends Vehicle implements Refuelable {
    PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed); // call parent
    }

    public void refuel() {
        System.out.println("refueling petrol vehicle"); // petrol logic
    }
}

/* electric vehicle */
class ElectricVehicle extends Vehicle {
    ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed); // call parent
    }

    void charge() {
        System.out.println("charging electric vehicle"); // electric logic
    }
}
