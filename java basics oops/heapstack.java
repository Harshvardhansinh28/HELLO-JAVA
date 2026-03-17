// Heap and Stack in Java
// In Java, memory is divided into two main areas: Heap and Stack.
// The Stack is used for static memory allocation and contains method calls, local variables, and reference variables. It operates in a last-in-first-out (LIFO) manner.
// The Heap is used for dynamic memory allocation and stores objects and their instance variables. It is managed by the Java Garbage Collector, which automatically frees memory that is no longer in use.
public class heapstack {
    public static void main(String[] args) {
        // Stack example: Local variables and method calls
        int a = 10; // Local variable stored in stack
        int b = 20; // Local variable stored in stack
        int sum = add(a, b); // Method call stored in stack
        System.out.println("Sum: " + sum);

        // Heap example: Objects and instance variables
        Person person1 = new Person("Alice", 30); // Object stored in heap
        Person person2 = new Person("Bob", 25);   // Object stored in heap
        person1.displayInfo(); // Method call stored in stack
        person2.displayInfo(); // Method call stored in stack
    }

    public static int add(int x, int y) {
        return x + y;
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}