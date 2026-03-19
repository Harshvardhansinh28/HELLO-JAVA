// Polymorphism in Java
// Polymorphism is a core concept in object-oriented programming that allows objects of different types to be treated as instances of the same type through a common interface.
// In Java, polymorphism is achieved through method overriding and method overloading.

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}
public class polymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.makeSound(); // Output: The animal makes a sound.
        myDog.makeSound();    // Output: The dog barks.
        myCat.makeSound();    // Output: The cat meows.
    }
}
// In this example, we have a superclass `Animal` with a method `makeSound()`. The subclasses `Dog` and `Cat` override this method to provide specific implementations. In the main method, we create instances of `Animal`, `Dog`, and `Cat`, but we treat them all as `Animal` types. When we call the `makeSound()` method on each instance, the appropriate overridden method is executed based on the actual object type, demonstrating polymorphism.
// Polymorphism allows us to write more flexible and reusable code, as we can work with objects of different types through a common interface.
// Method Overloading in Java
// Method overloading allows a class to have multiple methods with the same name but different parameters.
class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }
}
// Method Overriding in Java
// Method overriding allows a subclass to provide a specific implementation of a method that is already defined in its parent class.
