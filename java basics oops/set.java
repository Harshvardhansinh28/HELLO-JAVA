// Set in Java
// A Set is a collection that does not allow duplicate elements and does not maintain any order.
import java.util.HashSet;
import java.util.Set;
public class set {
    public static void main(String[] args) {
        // Creating a Set
        Set<String> set = new HashSet<>();

        // Adding elements to the Set
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // Duplicate element, will not be added

        // Displaying the Set
        System.out.println("Set: " + set);

        // Checking if an element exists in the Set
        System.out.println("Does the Set contain 'Banana'? " + set.contains("Banana"));
        System.out.println("Does the Set contain 'Grapes'? " + set.contains("Grapes"));

        // Removing an element from the Set
        set.remove("Banana");
        System.out.println("Set after removing 'Banana': " + set);
    }
}