package arrayoperations;

import java.util.Arrays;

public class ArrayInsertions {
    public static void main(String[] args) {
        int[] numbers = new int[6];
        add(numbers,1);
        add(numbers,2);
        add(numbers,3);
        add(numbers,4);
        add(numbers,5,4);
        addLast(numbers,6);
        System.out.println(Arrays.toString(numbers));
    }

    public static void add(int[] numbers, int element){
        for (int i = numbers.length-1; i > 0; i--) {
            numbers[i] = numbers[i-1];
        }
        numbers[0] = element;
    }

    public static void add(int[] numbers, int element, int index){
        for (int i = numbers.length-1; i >= index; i--) {
            numbers[i] = numbers[i-1];
        }
        numbers[index] = element;
    }

    public static void addLast(int[] numbers, int element){
        numbers[numbers.length-1] = element;
    }
}
