// The abstract keyword in Java
// The abstract keyword in Java is used to create abstract classes and abstract methods.
// An abstract class is a class that cannot be instantiated and is meant to be subclassed.
// An abstract method is a method that is declared without an implementation.
// Abstract classes and methods are used to achieve abstraction in Java.

abstract class AbstractKeyword {
    // Abstract method (no implementation)
    public abstract void makeSound();

    // Regular method (with implementation)
    public void sleep() {
        System.out.println("The animal sleeps.");
    }
}

class Dog extends AbstractKeyword {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

