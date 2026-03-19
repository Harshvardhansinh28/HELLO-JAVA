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

public class methodoverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Addition (2 ints): " + calc.add(5, 3));
        System.out.println("Addition (3 ints): " + calc.add(5, 3, 2));
        System.out.println("Addition (2 doubles): " + calc.add(5.5, 3.2));
    }
}

