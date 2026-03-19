// Mutable and Immutable Strings in Java
// In Java, Strings are immutable, meaning once a String object is created, its value cannot be changed.
// However, there are mutable alternatives like StringBuilder and StringBuffer that allow modification of strings.
public class mutableimmutablestring {
    public static void main(String[] args) {
        // Immutable String
        String immutableStr = "Hello";
        System.out.println("Immutable String: " + immutableStr);
        // Attempting to change the string will create a new string object
        immutableStr = immutableStr + " World!";
        System.out.println("After modification attempt: " + immutableStr);

        // Mutable String using StringBuilder
        StringBuilder mutableStr = new StringBuilder("Hello");
        System.out.println("Mutable String (StringBuilder): " + mutableStr);
        // Modifying the string using append method
        mutableStr.append(" World!");
        System.out.println("After modification: " + mutableStr);
    }
}