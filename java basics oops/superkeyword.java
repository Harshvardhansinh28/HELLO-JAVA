// The super keyword in Java
// The super keyword in Java is used to refer to the superclass (parent class) of the current class.
// It can be used to call the superclass constructor or access superclass methods and variables.

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
        super.displayInfo(); // Call the superclass method
        System.out.println("Breed: " + this.breed);
    }
}