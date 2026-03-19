// Inheritance in Java
// Inheritance is a mechanism in which one class acquires the properties and methods of another class.
// The class that inherits the properties is called the subclass (or derived class), and the class whose properties are inherited is called the superclass (or base class).

class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age); // Call the superclass constructor
        this.breed = breed;
    }

    public void displayDogInfo() {
        displayInfo(); // Call the superclass method
        System.out.println("Breed: " + this.breed);
    }
}
// types of inheritance in java
// 1. Single Inheritance: A class inherits from another class.
// 2. Multilevel Inheritance: A class inherits from a class that is already a subclass of another class.
// 3. Hierarchical Inheritance: Multiple classes inherit from a single superclass.
// 4. Multiple Inheritance (using interfaces): A class implements multiple interfaces, allowing it to inherit from multiple sources.
// Note: Java does not support multiple inheritance with classes to avoid ambiguity, but it can be achieved using interfaces.
//example demonstrates inheritance in Java. The Dog class extends the Animal class, inheriting its properties and methods. The Dog class has its own property (breed) and a method (displayDogInfo) that calls the superclass method (displayInfo) to display the inherited properties along with its own property.