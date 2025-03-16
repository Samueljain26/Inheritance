// Main class
public class CourseManagement {
    public static void main(String[] args) {
        Course freeCourse = new Course("Java Basics", "4 weeks");
        OnlineCourse onlineCourse = new OnlineCourse("Python for Beginners", "6 weeks", "Udemy", true);
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Data Structures in C++", "8 weeks", "Coursera", false, 5000, 10);

        // Polymorphism
        freeCourse.displayCourseDetails();
        onlineCourse.displayCourseDetails();
        paidCourse.displayCourseDetails();
    }
}

// Superclass
class Course {
    String courseName;
    String duration;

    // Constructor
    Course(String courseName, String duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Method
    void displayCourseDetails() {
        System.out.println("Course -> Name: " + courseName + ", Duration: " + duration);
    }
}

// Subclass
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    // Constructor
    OnlineCourse(String courseName, String duration, String platform, boolean isRecorded) {
        super(courseName, duration); 
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    void displayCourseDetails() {
        System.out.println("Online Course -> Name: " + courseName + ", Duration: " + duration + ", Platform: " + platform + ", Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Subclass
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount; 

    // Constructor
    PaidOnlineCourse(String courseName, String duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded); 
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    void displayCourseDetails() {
        double finalFee = fee - (fee * discount / 100);
        System.out.println("Paid Online Course -> Name: " + courseName + ", Duration: " + duration + ", Platform: " + platform + ", Recorded: " + (isRecorded ? "Yes" : "No") + ", Fee: $" + fee + ", Discount: " + discount + "%, Final Fee: $" + finalFee);
    }
}

/*
Course -> Name: Java Basics, Duration: 4 weeks
Online Course -> Name: Python for Beginners, Duration: 6 weeks, Platform: Udemy, Recorded: Yes
Paid Online Course -> Name: Data Structures in C++, Duration: 8 weeks, Platform: Coursera, Recorded: No, Fee: $5000.0, Discount: 10.0%, Final Fee: $4500.0
*/
