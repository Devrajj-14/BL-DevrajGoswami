package Inheritance;

/* main file for smart home single inheritance */
public class SmartHomeMain {
    public static void main(String[] args) {
        Thermostat t = new Thermostat("t100", "on", 24);
        t.displayStatus(); // show status
    }
}

/* superclass device */
class Device {
    String deviceId;
    String status;

    Device(String deviceId, String status) {
        this.deviceId = deviceId; // assign id
        this.status = status; // assign status
    }

    void displayStatus() {
        System.out.println("device " + deviceId + " status " + status); // print base status
    }
}

/* thermostat extends device */
class Thermostat extends Device {
    int temperatureSetting;

    Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status); // call parent
        this.temperatureSetting = temperatureSetting; // assign temp
    }

    void displayStatus() {
        System.out.println("device " + deviceId + " status " + status + " temp " + temperatureSetting); // override
    }
}
