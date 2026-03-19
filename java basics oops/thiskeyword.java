// This keyword in Java
// The this keyword in Java is used to refer to the current instance of a class.
// It can be used to access instance variables and methods of the current object.

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}
