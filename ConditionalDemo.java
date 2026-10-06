import java.util.Scanner;

class ConditionalDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        // if statement
        if (marks >= 90) {
            System.out.println("Excellent marks!");
        }

        // if-else statement
        if (marks >= 40) {
            System.out.println("You are pass.");
        } else {
            System.out.println("You are fail!");
        }

        // Nested if
        if (marks >= 40) {
            if (marks >= 75) {
                System.out.println("You got Distinction!");
            } else {
                System.out.println("You passed normally!");
            }
        }

        // Switch statement
        System.out.print("Enter day number (1-3): ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            default:
                System.out.println("Invalid day");
        }

        sc.close();
    }
}
