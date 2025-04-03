package sortingalgorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {0,3,2,6,-10};
        selection(array);
        System.out.println(Arrays.toString(array));
    }

    public static void selection(int[] array){
        for (int i = 0; i < array.length; i++) {
            int first = i;
            int small = small(array,first);
            swap(array,first,small);
        }
    }

    public static int small(int[] array, int first) {
        int small = first;
        for (int i = first; i < array.length; i++) {
            if (array[i]<array[small]){
                small = i;
            }
        }
        return small;
    }

    public static void swap(int[]array,int first,int small){
        int temp = array[first];
        array[first] = array[small];
        array[small] = temp;
    }
}
