// Main class 
class AnimalHierarchy {
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy", 3);
        Animal cat = new Cat("Whiskers", 2);
        Animal bird = new Bird("Tweety", 1);
        // Polymorphism
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}
// Superclass: Animal
class Animal {
    String name;
    int age;
    // Constructor
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Method to be overridden by subclasses
    void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}
// Subclass
class Dog extends Animal {
    // Constructor
    Dog(String name, int age) {
        super(name, age);
    }
    @Override
    void makeSound() {
        System.out.println(name + " barks");
    }
}
// Subclass
class Cat extends Animal {
    // Constructor
    Cat(String name, int age) {
        super(name, age);
    }
    @Override
    void makeSound() {
        System.out.println(name + " meows");
    }
}
// Subclass
class Bird extends Animal {
    // Constructor
    Bird(String name, int age) {
        super(name, age);
    }
    @Override
    void makeSound() {
        System.out.println(name + " chirps");
    }
}
/*Buddy barks
Whiskers meows
Tweety chirps
 */