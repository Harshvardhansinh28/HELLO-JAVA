// Switch Statement in Java
// The switch statement is used to execute one block of code among many options based on the value of a variable or expression. It is an alternative to using multiple if-else statements when you have a fixed set of possible values for a variable.
class SwitchStatementExample {
    public static void main(String[] args) {
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}

