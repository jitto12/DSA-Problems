package arrayoperations;

import java.util.Arrays;

public class ArrayTraversal {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6};
        int[] numbers2 = {1,2,3,4,5,6};
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(onlyEvenNumber(numbers2)));
    }

    public static int[] onlyEvenNumber(int[] numbers){
        int[] num = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 ==0){
                num[i] = numbers[i];
            }
        }
        return num;
    }
}
