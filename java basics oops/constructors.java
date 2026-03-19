// Constructors in Java
// A constructor in Java is a special method that is called when an object of a class is created.
// It has the same name as the class and does not have a return type.

class Student {
    private String name;
    private int age;

    // Default constructor
    public Student() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}
public class constructors {
    public static void main(String[] args) {
        // Using default constructor
        Student s1 = new Student();
        s1.displayInfo();

        // Using parameterized constructor
        Student s2 = new Student("Alice", 20);
        s2.displayInfo();
    }
}
//there are two constructors in the Student class: a default constructor that initializes the name to "Unknown" and age to 0, and a parameterized constructor that allows setting the name and age when creating an object. The main method demonstrates how to use both constructors to create Student objects and display their information.
