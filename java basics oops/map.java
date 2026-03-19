// Map in Java
import java.util.HashMap;
import java.util.Map;
public class map {
    public static void main(String[] args) {
        // Creating a Map
        Map<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the Map
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        // Displaying the Map
        System.out.println("Map: " + map);

        // Accessing a value using a key
        System.out.println("Age of Alice: " + map.get("Alice"));

        // Checking if a key exists in the Map
        System.out.println("Does the Map contain 'Bob'? " + map.containsKey("Bob"));
        System.out.println("Does the Map contain 'David'? " + map.containsKey("David"));

        // Removing a key-value pair from the Map
        map.remove("Charlie");
        System.out.println("Map after removing 'Charlie': " + map);
    }
}
