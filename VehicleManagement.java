// Main class
public class VehicleManagement {
    public static void main(String[] args) {
        ElectricVehicle tesla = new ElectricVehicle("Tesla Model 3", 200);
        PetrolVehicle ford = new PetrolVehicle("Ford Mustang", 250);

        // Display information
        tesla.displayInfo();
        ford.displayInfo();

        tesla.charge();
        ford.refuel();
    }
}

// Superclass
class Vehicle {
    String model;
    int maxSpeed;

    // Constructor
    Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    void displayInfo() {
        System.out.println("Vehicle Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }
}
// Interface
interface Refuelable {
    void refuel(); 
}

// Subclass
class ElectricVehicle extends Vehicle {
    // Constructor
    ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }
    void charge() {
        System.out.println(model + " is charging.");
    }
}

// Subclass
class PetrolVehicle extends Vehicle implements Refuelable {
    // Constructor
    PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    // Implementing refuel() method from Refuelable interface
    public void refuel() {
        System.out.println(model + " is refueling.");
    }
}
/*Vehicle Model: Tesla Model 3, Max Speed: 200 km/h
Vehicle Model: Ford Mustang, Max Speed: 250 km/h
Tesla Model 3 is charging.
Ford Mustang is refueling.
 */