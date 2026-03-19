// Upcasting and Downcasting in Java
// Upcasting is the process of converting a subclass object to a superclass reference.
// Downcasting is the process of converting a superclass reference to a subclass object.

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("The dog barks.");
    }

    public void fetch() {
        System.out.println("The dog fetches the ball.");
    }
}