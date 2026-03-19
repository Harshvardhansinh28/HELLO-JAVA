// Exception Hierarchy in Java
// In Java, exceptions are organized in a hierarchy. The base class for all exceptions is Throwable.
// Throwable has two main subclasses: Error and Exception.
// Error represents serious problems that a reasonable application should not try to catch.
// Exception represents conditions that a reasonable application might want to catch.

 class ExceptionHierarchy {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // This will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}

