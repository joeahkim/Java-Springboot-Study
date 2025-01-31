package ControlStatements;

public class forAndForEach {
    public static void main(String[] args) {
        System.out.println("Even numbers between 0 and 50:");
        for (int i = 0; i <= 50; i = i + 2) {
            System.out.println("i = " + i);
        }
        System.out.println("Odd numbers between 0 and 50:");
        for (int x = 1; x <= 50; x = x + 2) {
            System.out.println("x = " + x);
        }

        int num = (int) (Math.random() * 100);
        System.out.println("Random number: " + num);
        for (int i = 0; i <= 100; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }

}
