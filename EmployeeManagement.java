// Main class
class EmployeeManagement {
    public static void main(String[] args) {
        Employee manager = new Manager("Alice", 101, 90000, 5);
        Employee developer = new Developer("Bob", 102, 70000, "Java");
        Employee intern = new Intern("Charlie", 103, 30000, 6);

        // Polymorphism
        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();
    }
}

// super class: Employee
class Employee {
    String name;
    int id;
    double salary;

    // Constructor
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: $" + salary);
    }
}

// Subclass
class Manager extends Employee {
    int teamSize;
    // Constructor
    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }
    @Override
    void displayDetails() {
        System.out.println("Manager -> ID: " + id + ", Name: " + name + ", Salary: $" + salary + ", Team Size: " + teamSize);
    }
}
// Subclass
class Developer extends Employee {
    String programmingLanguage;
    // Constructor
    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    void displayDetails() {
        System.out.println("Developer -> ID: " + id + ", Name: " + name + ", Salary: $" + salary + ", Programming Language: " + programmingLanguage);
    }
}
// Subclass
class Intern extends Employee {
    int internshipDuration; // Duration in months
    // Constructor
    Intern(String name, int id, double salary, int internshipDuration) {
        super(name, id, salary);
        this.internshipDuration = internshipDuration;
    }
    @Override
    void displayDetails() {
        System.out.println("Intern -> ID: " + id + ", Name: " + name + ", Salary: $" + salary + ", Internship Duration: " + internshipDuration + " months");
    }
}
