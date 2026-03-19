// The final keyword in Java
// The final keyword in Java is used to restrict the user from making changes to a variable, method, or class.
// When a variable is declared as final, its value cannot be changed once it is initialized.
// When a method is declared as final, it cannot be overridden by subclasses.
// When a class is declared as final, it cannot be inherited by other classes.

 class FinalKeyword {
    public static void main(String[] args) {
        final int x = 10; // final variable
        // x = 20; // This will cause a compilation error

        System.out.println(x);
    }
}