package arraypracticeproblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArray {
    public static void main(String[] args) {
        int[] array = {4,9,5};
        int[] array2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersectionElements(array, array2)));
    }

    public static int[] intersectionElements(int[] array, int[] array2){
        Arrays.sort(array);
        Arrays.sort(array2);
        Set<Integer> intersection = new HashSet<>();
        int i=0;
        int j=0;
        while (i<array.length && j< array2.length){
            if (array[i] == array2[j]){
                intersection.add(array[i]);
                i++;
                j++;
            } else if (array[i]<array2[j]) {
                i++;
            }else{
                j++;
            }
        }
        int[] result = new int[intersection.size()];
        int index =0;
        for (int num : intersection){
            result[index++] = num;
        }
        return result;
    }
}
