package OOP;

// static keyword is used to create a class level variable or method
// static variables are shared among all the objects of the class

public class StaticKeyword {
    int id;
    String name;
    static String college = "XYZ";

    StaticKeyword(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id + " Name: " + name + " College: " + college);
    }

    public static void changeCollege() {
        college = "ABC";
    }

    public static void main(String[] args) {
        StaticKeyword s1 = new StaticKeyword(1, "John");
        s1.display();
        StaticKeyword.changeCollege();
        StaticKeyword s2 = new StaticKeyword(2, "Jane");
        s2.display();
    }
}
