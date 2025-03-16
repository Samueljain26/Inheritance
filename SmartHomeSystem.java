// Main class
public class SmartHomeSystem {
    public static void main(String[] args) {
        Device device1 = new Thermostat("D001", "ON", 24);
        Device device2 = new Thermostat("D002", "OFF", 18);

        // Polymorphism
        device1.displayStatus();
        device2.displayStatus();
    }
}

// Superclass
class Device {  
    String deviceId;
    String status;

    // Constructor
    Device(String deviceId, String status) {  
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method
    void displayStatus() {  
        System.out.println("Device -> ID: " + deviceId + ", Status: " + status);
    }
}

// Subclass
class Thermostat extends Device { // extends for inheritance  
    int temperatureSetting;  

    // Constructor  
    Thermostat(String deviceId, String status, int temperatureSetting) {  
        super(deviceId, status); // super keyword  
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus() {  
        System.out.println("Thermostat -> ID: " + deviceId + ", Status: " + status + ", Temperature: " + temperatureSetting + "°C");
    }
}
/* Output:
Thermostat -> ID: D001, Status: ON, Temperature: 24°C
Thermostat -> ID: D002, Status: OFF, Temperature: 18°C
*/
