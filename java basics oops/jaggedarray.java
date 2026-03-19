// Jagged Array in Java
// A jagged array is an array of arrays where each row can have a different number of columns.

public class jaggedarray {
    public static void main(String[] args) {
        // Declaring a jagged array
        int[][] jaggedArray = new int[3][];

        // Initializing the rows of the jagged array
        jaggedArray[0] = new int[3];
        jaggedArray[1] = new int[2];
        jaggedArray[2] = new int[4];

        // Initializing elements of the jagged array
        jaggedArray[0][0] = 1;
        jaggedArray[0][1] = 2;
        jaggedArray[0][2] = 3;
        jaggedArray[1][0] = 4;
        jaggedArray[1][1] = 5;
        jaggedArray[2][0] = 6;
        jaggedArray[2][1] = 7;
        jaggedArray[2][2] = 8;
        jaggedArray[2][3] = 9;

        // Accessing elements of the jagged array
        System.out.println("Element at index [0][0]: " + jaggedArray[0][0]);
        System.out.println("Element at index [0][1]: " + jaggedArray[0][1]);
        System.out.println("Element at index [0][2]: " + jaggedArray[0][2]);
        System.out.println("Element at index [1][0]: " + jaggedArray[1][0]);
        System.out.println("Element at index [1][1]: " + jaggedArray[1][1]);
        System.out.println("Element at index [2][0]: " + jaggedArray[2][0]);
        System.out.println("Element at index [2][1]: " + jaggedArray[2][1]);
        System.out.println("Element at index [2][2]: " + jaggedArray[2][2]);
        System.out.println("Element at index [2][3]: " + jaggedArray[2][3]);
    }
}