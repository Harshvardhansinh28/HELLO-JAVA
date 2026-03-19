// Encapsulation in Java
// Encapsulation is the process of hiding the internal details of an object and providing a public interface to interact with it.
// It is achieved by making the fields of a class private and providing public methods to access and modify them.

class Student {
    private String name;  // Private field
    private int age;      // Private field

    // Public constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public methods to access private fields
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Public methods to modify private fields
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
 class EncapsulationExample {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20);
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());

        student.setName("Bob");
        student.setAge(25);
        System.out.println("Updated Name: " + student.getName());
        System.out.println("Updated Age: " + student.getAge());
    }
}
//example of encapsulation in java, where the Student class has private fields and public methods to access and modify those fields.
