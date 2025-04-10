package arrayoperations;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[6];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the Element "+i+" : ");
            numbers[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
    }
}
