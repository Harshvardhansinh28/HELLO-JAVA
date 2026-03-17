// variable is a container that holds data that can be changed during the execution of a program.
// In Java, there are different types of variables, including:
// 1. Local variables: declared inside a method
// 2. Instance variables: declared inside a class but outside any method
// 3. Static variables: declared with the static keyword
// Example of a local variable
class VariableExample {
    public static void main(String[] args) {
        int localVariable = 10; // This is a local variable
        System.out.println("Local Variable: " + localVariable);
    }
} 
// Example of an instance variable
class InstanceVariableExample {
    int instanceVariable; // This is an instance variable

    public void setInstanceVariable(int value) {
        instanceVariable = value;
    }

    public void displayInstanceVariable() {
        System.out.println("Instance Variable: " + instanceVariable);
    }
}
// Example of a static variable
class StaticVariableExample {
    static int staticVariable; // This is a static variable

    public static void setStaticVariable(int value) {
        staticVariable = value;
    }

    public static void displayStaticVariable() {
        System.out.println("Static Variable: " + staticVariable);
    }
}