// Ducking in Java
// Ducking is a technique where an exception is not handled in the current method, but is passed on to the calling method.
// This is done by declaring the exception in the method signature using the 'throws' keyword.

class DuckingExample {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
    }

    public static void method1() throws Exception {
        method2();
    }

    public static void method2() throws Exception {
        throw new Exception("An error occurred in method2");
    }
}
// In this example, method2 throws an exception, which is not handled in method1. Instead, it is declared to be thrown by method1, and the exception is ultimately caught in the main method. This is an example of ducking an exception.
