// Conversion and Casting in Java
// Conversion and casting are techniques used to convert one data type to another in Java.
// There are two types of conversion:
// 1. Widening Conversion (Automatic): Converting a smaller data type to a larger data type
// 2. Narrowing Conversion (Manual): Converting a larger data type to a smaller data type       
// Example of Widening Conversion
class WideningConversionExample {
    public static void main(String[] args) {
        int intValue = 100;
        double doubleValue = intValue; // Automatic widening conversion
        System.out.println("Integer Value: " + intValue);
        System.out.println("Double Value: " + doubleValue);
    }
}
// Example of Narrowing Conversion
class NarrowingConversionExample {  
    public static void main(String[] args) {
        double doubleValue = 100.5;
        int intValue = (int) doubleValue; // Manual narrowing conversion
        System.out.println("Double Value: " + doubleValue);
        System.out.println("Integer Value: " + intValue);
    }
}