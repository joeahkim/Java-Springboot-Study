package OOP;

// Constructors are special type of methods which are used to initialize the object
// Constructors have the same name as the class name
// Constructors do not have a return type
// default constructor - no argument constructor
// parameterized constructor - constructor with arguments
public class Constructors {
    int id;
    String name;
    double marks;

    // default constructor
    Constructors() {
        id = 1;
        name = "John";
        marks = 90.0;
    }

    // parameterized constructor
    Constructors(int i, String n, double m) {
        id = i;
        name = n;
        marks = m;
    }

    void display() {
        System.out.println("ID: " + id + " Name: " + name + " Marks: " + marks);
    }

    public static void main(String[] args) {
        Constructors c1 = new Constructors();
        c1.display();
        Constructors c2 = new Constructors(2, "Jane", 95.0);
        c2.display();
    }

}
