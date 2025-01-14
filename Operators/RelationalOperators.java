package Operators;

// Relational Operators >, >=, <, <=, ==, !=
// Relational operators are used to compare two values. The result of a
// relational operator is a boolean value, either true or false.
public class RelationalOperators {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a == b);
        System.out.println(a != b);
    }
}