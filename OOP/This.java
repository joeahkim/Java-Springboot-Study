package OOP;

// it is a reference keyword referring to the current object
public class This {
    int id;
    String name;
    double marks;

    This(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("ID: " + id + " Name: " + name + " Marks: " + marks);
    }

    public static void main(String[] args) {
        This t1 = new This(1, "John", 90.0);
        t1.display();
        This t2 = new This(2, "Jane", 95.0);
        t2.display();
    }
}
