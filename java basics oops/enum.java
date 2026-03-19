// Enums in Java
// An enum in Java is a special type that represents a group of constants.
// Enums are used to define a fixed set of named values.

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

class EnumExample {
    public static void main(String[] args) {
        Day today = Day.WEDNESDAY;
        System.out.println("Today is: " + today);
    }
}
// Output: Today is: WEDNESDAY
