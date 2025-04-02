package sortingalgorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {3,3,2,4,1,5};
        bubbleSort(array);
    }

    public static void bubbleSort(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
