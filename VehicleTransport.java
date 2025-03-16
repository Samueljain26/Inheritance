// Main class
class VehicleTransport{
    public static void main(String[] args) {
        Vehicle car = new Car(180, "Petrol", 5);
        Vehicle truck = new Truck(120, "Diesel", 10000);
        Vehicle motorcycle = new Motorcycle(200, "Petrol", "Sport");

        // Polymorphism
        Vehicle[] vehicles = {car, truck, motorcycle};
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].displayInfo(); 
        }
    }
}
// Superclass
class Vehicle {
    int maxSpeed;
    String fuelType;

    // Constructor
    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + "Fuel Type: " + fuelType);
    }
}

// Subclass
class Car extends Vehicle {
    int seatCapacity;

    // Constructor
    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    void displayInfo() {
        System.out.println("Car -> Max Speed: " + maxSpeed + "Fuel Type: " + fuelType + ", Seat Capacity: " + seatCapacity);
    }
}

// Subclass
class Truck extends Vehicle {
    int loadCapacity; 
    // Constructor
    Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    void displayInfo() {
        System.out.println("Truck -> Max Speed: " + maxSpeed + " Fuel Type: " + fuelType + ", Load Capacity: " + loadCapacity );
    }
}

// Subclass
class Motorcycle extends Vehicle {
    String type;

    // Constructor
    Motorcycle(int maxSpeed, String fuelType, String type) {
        super(maxSpeed, fuelType);
        this.type = type;
    }

    @Override
    void displayInfo() {
        System.out.println("Motorcycle -> Max Speed: " + maxSpeed + ", Fuel Type: " + fuelType + ", Type: " + type);
    }
}
/*Car -> Max Speed: 180Fuel Type: Petrol, Seat Capacity: 5
Truck -> Max Speed: 120 Fuel Type: Diesel, Load Capacity: 10000
Motorcycle -> Max Speed: 200, Fuel Type: Petrol, Type: Sport */