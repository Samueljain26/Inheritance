// Main class
public class SchoolSystem {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Alice", 35, "Mathematics");
        Student student = new Student("Bob", 16, "10th Grade");
        Staff staff = new Staff("Charlie", 40, "Administrator");

        // Display roles
        teacher.displayRole();
        student.displayRole();
        staff.displayRole();
    }
}

// Superclass
class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Subclass
class Teacher extends Person {
    String subject;

    // Constructor
    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println(name + " is a Teacher who teaches " + subject);
    }
}

// Subclass
class Student extends Person {
    String grade;

    // Constructor
    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println(name + " is a Student in " + grade);
    }
}

// Subclass
class Staff extends Person {
    String position;

    // Constructor
    Staff(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }

    void displayRole() {
        System.out.println(name + " is a Staff member working as " + position);
    }
}
/*Alice is a Teacher who teaches Mathematics
Bob is a Student in 10th Grade
Charlie is a Staff member working as Administrator */