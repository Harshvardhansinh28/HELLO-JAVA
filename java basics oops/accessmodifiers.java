// Access Modifiers in Java
// Access modifiers in Java are keywords that are used to specify the accessibility of classes, methods, and variables.
// There are four types of access modifiers in Java:
// 1. private: The access level of a private modifier is only within the same class.
// 2. default: The access level of a default modifier is within the same package.
// 3. protected: The access level of a protected modifier is within the same package and subclasses.
// 4. public: The access level of a public modifier is everywhere.

class Student {
    private String name; // private access modifier
    int age; // default access modifier
    protected String email; // protected access modifier
    public String phone; // public access modifier

    public Student(String name, int age, String email, String phone) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
    }


    void displayDefaultInfo() { // default method
        System.out.println("Age: " + this.age);
    }

    protected void displayProtectedInfo() { // protected method
        System.out.println("Email: " + this.email);
    }

    public void displayPublicInfo() { // public method
        System.out.println("Phone: " + this.phone);
    }

    public String getName() { // getter method for name
        return this.name;
    }
}