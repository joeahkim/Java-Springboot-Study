package ControlStatements;

public class Loop {
    public static void main(String[] args) {

        int marks = 1 + (int) (Math.random() * 100);
        System.out.println("Marks: " + marks);

        if (marks >= 85) {
            System.out.println("Grade: A+");
        } else if (marks >= 75) {
            System.out.println("Grade: A");
        } else if (marks >= 65) {
            System.out.println("Grade: B");
        } else if (marks >= 55) {
            System.out.println("Grade: C");
        } else if (marks >= 45) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: Fail");
        }
    }
}
