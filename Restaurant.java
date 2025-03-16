// Main class
public class Restaurant {
    public static void main(String[] args) {
        Chef chef = new Chef("Alice", 101);
        Waiter waiter = new Waiter("Bob", 102);
        //output
        chef.performDuties();
        waiter.performDuties();
    }
}

// Superclass
class Person {
    String name;
    int id;

    // Constructor
    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
// Interface
interface Worker {
    void performDuties(); // Method to be implemented by subclasses
}

// Subclass
class Chef extends Person implements Worker {
    // Constructor
    Chef(String name, int id) {
        super(name, id);
    }

    // Implementing performDuties()
    public void performDuties() {
        System.out.println(name + " (Chef) is cooking food.");
    }
}
// Subclass
class Waiter extends Person implements Worker {
    // Constructor
    Waiter(String name, int id) {
        super(name, id);
    }
    public void performDuties() {
        System.out.println(name + " (Waiter) is serving customers.");
    }
}
/*Alice (Chef) is cooking food.
Bob (Waiter) is serving customers.
 */