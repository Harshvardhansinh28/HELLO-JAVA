// Class and Object in Java
// A class is a blueprint for creating objects. An object is an instance of a class.
class Student {
    String name;
    int age;

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class classobject {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Alice";
        s1.age = 20;
        s1.displayInfo();
    }
}