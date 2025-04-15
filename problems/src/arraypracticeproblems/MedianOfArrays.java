package arraypracticeproblems;

import java.util.Arrays;

public class MedianOfArrays {
    public static void main(String[] args) {
        int[] array1 = {1,4,5};
        int[] array2 = {2,3};
        double result = findMedianSortedArrays(array1,array2);
        System.out.println(result);
    }

    public static double findMedianSortedArrays(int[] array1, int[] array2) {
        int [] merge = mergeArray(array1,array2);
        Arrays.sort(merge);
        return findMedian(merge);
    }

    public static double findMedian(int[] array){
        int mid = (array.length - 1) / 2;
        if (array.length%2==1){
            return array[mid];
        }else {
            return (array[mid]+ (double) array[mid + 1]) /2;
        }
    }

    public static int[] mergeArray(int[] array1, int[] array2){
        int[] mergedArray = new int[array1.length+ array2.length];
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
        System.arraycopy(array2, 0, mergedArray, array1.length + 0, array2.length);
        return mergedArray;
    }
}
