// String in Java
// A String in Java is an object that represents a sequence of characters.
// Strings are immutable, meaning once a String object is created, its value cannot be changed.
public class string {
    public static void main(String[] args) {
        // Creating a String object
        String str = "Hello, World!";
        System.out.println("String: " + str);

        // Using various String methods
        System.out.println("Length of the string: " + str.length());
        System.out.println("Character at index 7: " + str.charAt(7));
        System.out.println("Substring from index 7 to 12: " + str.substring(7, 12));
    }
}