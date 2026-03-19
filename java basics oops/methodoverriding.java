// Method Overriding in Java
// Method overriding allows a subclass to provide a specific implementation of a method that is already defined in its parent class.

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

public class methodoverriding {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.makeSound(); // Output: The animal makes a sound
        dog.makeSound();    // Output: The dog barks
    }
}

