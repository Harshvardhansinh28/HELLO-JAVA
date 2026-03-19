// Static Keyword in Java
// The static keyword in Java is used to create class-level variables and methods.
// Static variables are shared among all instances of a class.
// Static methods can be called without creating an instance of the class.

 class StaticExample {
    static int staticVar = 10;  // Static variable
    int instanceVar = 20;       // Instance variable

    static void staticMethod() {  // Static method
        System.out.println("Static method called");
    }

    void instanceMethod() {       // Instance method
        System.out.println("Instance method called");
    }

    public static void main(String[] args) {
        System.out.println("Static variable: " + staticVar);
        staticMethod();  // Calling static method directly

        // Creating an instance of the class to call instance method
        StaticExample obj = new StaticExample();
        obj.instanceMethod();
    }
}

