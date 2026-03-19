// Lambda Expressions in Java
// A lambda expression is a concise way to represent an anonymous function.
// It is used to implement functional interfaces, which are interfaces with a single abstract method.

interface Calculator {
    int calculate(int a, int b);
}

 class LambdaExample {
    public static void main(String[] args) {
        // Using lambda expression to implement the Calculator interface
        Calculator add = (x, y) -> x + y;
        Calculator multiply = (x, y) -> x * y;

        System.out.println("Addition: " + add.calculate(5, 3));
        System.out.println("Multiplication: " + multiply.calculate(5, 3));
    }
}