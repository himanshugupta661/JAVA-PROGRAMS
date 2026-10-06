import java.util.Scanner;

class DataTypeDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Data types and Variables
        int age;
        double marks;
        char grade;
        boolean pass;

        // User input
        System.out.print("Enter your age: ");
        age = sc.nextInt();

        System.out.print("Enter your marks: ");
        marks = sc.nextDouble();

        // Grade calculation
        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 75) {
            grade = 'B';
        } else if (marks >= 60) {
            grade = 'C';
        } else if (marks >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Operators
        double total = marks + 5;
        double percentage = marks * 100 / 100;

        // Type casting
        int newMarks = (int) marks;

        // Conditional result
        pass = marks >= 40;

        System.out.println("--- Result ---");
        System.out.println("Age = " + age);
        System.out.println("Marks = " + marks);
        System.out.println("Grade = " + grade);
        System.out.println("Marks after addition = " + total);
        System.out.println("Percentage = " + percentage);
        System.out.println("Marks after type casting = " + newMarks);
        System.out.println("Pass = " + pass);

        sc.close();
    }
}