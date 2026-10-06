public class Student {

    // Static field
    static String college = "CSVTU Bhilai";

    // Instance fields
    String name;
    int age;

    // Default constructor
    Student() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method overloading - two parameters
    void display(String name) {
        System.out.println("Name: " + name);
    }

    // Method overloading - two parameters
    void display(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Static method
    static void showCollege() {
        System.out.println("College: " + college);
    }

    public static void main(String[] args) {

        // Creating objects using overloaded constructors
        Student s1 = new Student();
        Student s2 = new Student("Himanshu", 20);

        System.out.println("Student 1:");
        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);

        System.out.println("\nStudent 2:");
        System.out.println("Name: " + s2.name);
        System.out.println("Age: " + s2.age);

        // Calling overloaded methods
        System.out.println("\nMethod Overloading:");
        s2.display("Himanshu");
        s2.display("Himanshu", 20);

        // Calling static method
        System.out.println("\nStatic Method:");
        Student.showCollege();
    }
}