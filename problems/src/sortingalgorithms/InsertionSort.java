package sortingalgorithms;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {3,5,1,2,4};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void insertionSort(int[] array){
        for (int i = 0; i <= array.length-2; i++) {
            for (int j = i+1; j>0; j--) {
                if (array[j]<array[j-1]){
                    swap(array,j,j-1);
                }else {
                    break;
                }
            }
        }
    }
    public static void swap(int[]array,int first,int small){
        int temp = array[first];
        array[first] = array[small];
        array[small] = temp;
    }
}
