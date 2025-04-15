package arraypracticeproblems;

import java.util.Arrays;

public class MaximumProductofThreeNumbers {
    public static void main(String[] args) {
        int[] array = {2,4,1,3,5,6,7};
        System.out.println(maximumProduct(array));
    }

    public static int maximumProduct(int[] array){
        Arrays.sort(array);
        reverseArray(array);
        int index = 0;
        return array[index]*array[index+1]*array[index+2];
    }

    public static int[] reverseArray(int[] array){
        int low =0;
        int high = array.length-1;
        while (low<high){
            int temp = array[low];
            array[low] = array[high];
            array[high] = temp;
            low++;
            high--;
        }
        return array;
    }
}
