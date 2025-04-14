package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindTheMissingNumber {
    public static void main(String[] args) {
        int[] array = {0,1};
        System.out.println(missingNumber(array));
    }

    public static int missingNumber(int[] array){
        Set<Integer> set = new HashSet<>();
        Arrays.sort(array);
        for (int num:array){
            set.add(num);
        }
        for (int i = 0; i <= array.length; i++) {
            if (!set.contains(i)){
                return i;
            }
        }
        return -1;
    }
}
