// Multidimensional Array in Java
// A multidimensional array is an array of arrays.

public class multidimensionalarray {
    public static void main(String[] args) {
        // Declaring a 2D array
        int[][] matrix = new int[3][3];

        // Initializing a 2D array
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;

        // Accessing elements of a 2D array
        System.out.println("Element at index [0][0]: " + matrix[0][0]);
        System.out.println("Element at index [0][1]: " + matrix[0][1]);
        System.out.println("Element at index [0][2]: " + matrix[0][2]);
        System.out.println("Element at index [1][0]: " + matrix[1][0]);
        System.out.println("Element at index [1][1]: " + matrix[1][1]);
        System.out.println("Element at index [1][2]: " + matrix[1][2]);
        System.out.println("Element at index [2][0]: " + matrix[2][0]);
        System.out.println("Element at index [2][1]: " + matrix[2][1]);
        System.out.println("Element at index [2][2]: " + matrix[2][2]);
    }
}