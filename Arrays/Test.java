package Arrays;

import java.util.Scanner;
import java.util.Arrays;

//  Arrays are a group/collection of similar/related items
public class Test {
    public static void main(String[] args) {
        int[] arr = new int[5]; // Declaration of an array
        String[] cities;

        cities = new String[5]; // Declaration of an array
        int[] numbers = { 1, 4, 6, 34, 77, 234, 5 }; // Declaration and initialization of an array
        System.out.println(numbers[3]); // Accessing an element of an array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        // sorting arrays elements
        Arrays.sort(numbers);
        for (int i : numbers) {
            System.out.println(i);
        }
        Scanner in = new Scanner(System.in);
        int[][] array = new int[3][4];
        for (int x = 0; x < 3; x++) {
            for (int j = 0; j < 4; j++) {
                array[x][j] = in.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        in.close();
    }

}
