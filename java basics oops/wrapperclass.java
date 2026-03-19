// Wrapper Classes in Java
// Wrapper classes in Java provide a way to use primitive data types as objects.
// Each primitive data type has a corresponding wrapper class.
// For example, the int primitive data type has the Integer wrapper class.
// Wrapper classes are used when we need to use primitive data types in contexts that require objects, such as when working with collections or when using generic types.

 class WrapperClass {
    public static void main(String[] args) {
        // Creating wrapper objects
        Integer i = new Integer(10); // Deprecated way
        Integer j = Integer.valueOf(20); // Preferred way
        int k = j.intValue(); // Extracting primitive value

        System.out.println("Integer value: " + i);
        System.out.println("Integer value: " + j);
        System.out.println("Primitive value: " + k);
    }
}