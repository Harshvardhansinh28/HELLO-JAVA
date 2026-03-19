// Custom Exceptions in Java
// You can create your own custom exceptions by extending the Exception class or any of its subclasses.

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) throws InvalidAgeException {
        this.name = name;
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Invalid age. Please enter a valid age between 0 and 150.");
        }
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            Person person1 = new Person("Alice", 25);
            person1.displayInfo();

            Person person2 = new Person("Bob", -5); // This will throw an InvalidAgeException
            person2.displayInfo();
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
// In this example, we have created a custom exception called InvalidAgeException. The Person class has a constructor that throws this exception if the age provided is invalid. In the main method, we try to create a Person object with an invalid age, which results in the custom exception being thrown and caught in the catch block.
