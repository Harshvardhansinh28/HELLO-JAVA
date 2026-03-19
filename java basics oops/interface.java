// Interfaces in Java
// An interface in Java is a contract that defines a set of methods that a class must implement.
// Interfaces are used to achieve full abstraction and multiple inheritance in Java.

interface Animal {
    // By default public abstract
    void makeSound();
    void sleep();
}

//example of interface with multiple inheritance
interface Mammal {
    void giveBirth();
}

class Dog implements Animal, Mammal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }

    @Override
    public void sleep() {
        System.out.println("The dog sleeps.");
    }

    @Override
    public void giveBirth() {
        System.out.println("The dog gives birth to puppies.");
    }
}