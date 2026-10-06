public class RecursionGarbageString {

    // Recursive method to calculate factorial
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        // -------- Recursion --------
        int number = 5;

        System.out.println("Recursion:");
        System.out.println("Factorial of " + number + " = " + factorial(number));

        // -------- String Immutability --------
        System.out.println("\nString Immutability:");

        String str = "Hello";

        System.out.println("Original String: " + str);

        // A new String object is created
        str.concat(" Java");

        System.out.println("After concat without assignment: " + str);

        // Assigning the new String
        str = str.concat(" Java");

        System.out.println("After concat with assignment: " + str);

        // -------- Garbage Collection --------
        System.out.println("\nGarbage Collection:");

        String obj1 = new String("Object 1");
        String obj2 = new String("Object 2");

        System.out.println("Objects created.");
        System.out.println("Object 1 value: " + obj1);
        System.out.println("Object 2 value: " + obj2);

        // Making objects eligible for garbage collection
        obj1 = null;
        obj2 = null;

        System.out.println("Objects are now eligible for garbage collection.");

        // Requesting JVM to perform garbage collection
        System.gc();

        System.out.println("Garbage collection requested.");
    }
}