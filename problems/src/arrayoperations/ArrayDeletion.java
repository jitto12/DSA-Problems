package arrayoperations;

import java.util.Arrays;

public class ArrayDeletion {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6};
        delete(numbers,3);
        System.out.println(Arrays.toString(numbers));
    }

    public static void deleteFirst(int[] numbers){
        for (int i = 0; i < numbers.length-1; i++) {
            numbers[i] = numbers[i+1];
        }
        numbers[numbers.length-1] = 0;
    }

    public static void deleteLast(int[] numbers){
        numbers[numbers.length-1] = 0;
    }

    public static void delete(int[] numbers, int element){
        int index = linearSearch(numbers,element);
        if (index != -1){
            for (int i = index; i > numbers.length-1; i++) {
                numbers[i] = numbers[i+1];
            }
            numbers[numbers.length-1] = 0;
        }else{
            System.out.println("Element not found!");
        }
    }

    public static int linearSearch(int[] numbers, int element){
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == element){
                return i;
            }
        }
        return -1;
    }
}
