// Exception Handling in Java
// Exception handling is a mechanism to handle runtime errors in Java.
// It allows you to write robust code that can gracefully handle unexpected situations.

class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // This will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
// In this example, we are trying to access an index that is out of bounds for the array. The exception is caught in the catch block, and a message is printed to the console.
// You can also have multiple catch blocks to handle different types of exceptions, and a finally block that will always execute regardless of whether an exception was thrown or not.
// Example with multiple catch blocks and a finally block
class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // This will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("This block will always execute.");
        }
    }
}
