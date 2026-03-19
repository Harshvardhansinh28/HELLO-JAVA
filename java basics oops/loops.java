// Loops in Java
// Loops are used to execute a block of code repeatedly until a certain condition is met.
// There are three types of loops in Java: for loop, while loop, and do-while loop.
// For Loop in Java
class ForLoopExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }
    }
}
// While Loop in Java
class WhileLoopExample {    
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println("Iteration: " + i);
            i++;
        }
    }
}
// Do-While Loop in Java
class DoWhileLoopExample {  
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("Iteration: " + i);
            i++;
        } while (i <= 5);
    }
}