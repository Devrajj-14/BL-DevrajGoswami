/* main file for vehicle transport system */
public class VehicleTransportMain {
    public static void main(String[] args) {
        Vehicle[] list = {
                new Car(180, "petrol", 5),
                new Truck(120, "diesel", 10),
                new Motorcycle(160, "petrol", true)
        };

        for (Vehicle v : list) {
            v.displayInfo(); // polymorphism
        }
    }
}

/* superclass vehicle */
class Vehicle {
    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed; // assign speed
        this.fuelType = fuelType; // assign fuel
    }

    void displayInfo() {
        System.out.println(maxSpeed + " " + fuelType); // print base info
    }
}

/* car subclass */
class Car extends Vehicle {
    int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType); // call parent
        this.seatCapacity = seatCapacity; // assign seats
    }

    void displayInfo() {
        System.out.println(maxSpeed + " " + fuelType + " seats " + seatCapacity); // override
    }
}

/* truck subclass */
class Truck extends Vehicle {
    int loadTons;

    Truck(int maxSpeed, String fuelType, int loadTons) {
        super(maxSpeed, fuelType); // call parent
        this.loadTons = loadTons; // assign load
    }

    void displayInfo() {
        System.out.println(maxSpeed + " " + fuelType + " load " + loadTons); // override
    }
}

/* motorcycle subclass */
class Motorcycle extends Vehicle {
    boolean hasKickStart;

    Motorcycle(int maxSpeed, String fuelType, boolean hasKickStart) {
        super(maxSpeed, fuelType); // call parent
        this.hasKickStart = hasKickStart; // assign feature
    }

    void displayInfo() {
        System.out.println(maxSpeed + " " + fuelType + " kick " + hasKickStart); // override
    }
}
