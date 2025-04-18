package arraypracticeproblems;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] array = {0,1,0,3,12};
        zerosToEnd(array);
    }

    public static void zerosToEnd(int[] array){
        int low = 0;
        for (int height = 0; height <= array.length-1; height++) {
            if (array[height] != 0){
                int temp = array[height];
                array[height] = array[low];
                array[low] = temp;
                low++;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void zerosToFront(int[] array){
        int low =0;
        for (int height = 0; height <= array.length-1 ; height++) {
            if (array[height]==0){
                int temp = array[height];
                array[height] = array[low];
                array[low] = temp;
                low++;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void evenToFront(int [] array){
        int low = 0;
        for (int height = 0; height <= array.length-1; height++) {
            if (array[height] % 2 == 0){
                int temp = array[height];
                array[height] = array[low];
                array[low] = temp;
                low++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
