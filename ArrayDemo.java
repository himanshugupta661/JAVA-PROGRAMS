public class ArrayDemo {

    // Method to display 1D array
    static void displayOneD(int[] arr) {
        System.out.println("One-Dimensional Array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Method to calculate sum of 1D array
    static int calculateSum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return sum;
    }

    // Method to display 2D array
    static void displayTwoD(int[][] matrix) {
        System.out.println("\nMulti-Dimensional Array:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to demonstrate pass-by-value
    static void changeValue(int x) {
        x = 100;
        System.out.println("Value inside method: " + x);
    }

    public static void main(String[] args) {

        // Creating a One-Dimensional Array
        int[] numbers = {10, 20, 30, 40, 50};

        // Calling method to display 1D array
        displayOneD(numbers);

        // Calling method to calculate sum
        int sum = calculateSum(numbers);
        System.out.println("Sum of 1D Array: " + sum);

        // Creating a Two-Dimensional Array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Calling method to display 2D array
        displayTwoD(matrix);

        // Demonstrating Pass-by-Value
        int value = 50;

        System.out.println("\nBefore method call: " + value);

        changeValue(value);

        System.out.println("After method call: " + value);
    }
}