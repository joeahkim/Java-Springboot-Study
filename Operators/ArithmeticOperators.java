package Operators;

public class ArithmeticOperators {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        int result = x / y;
        System.out.println("Result: " + result);

        int multiply = x * y;
        System.out.println("Multiply: " + multiply);

        int modulus = x % y;
        System.out.println("Modulus: " + modulus);
    }
}