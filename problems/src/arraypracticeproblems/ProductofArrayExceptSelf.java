package arraypracticeproblems;

import java.util.Arrays;

public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(Arrays.toString(product(array)));
    }

    public static int[] product(int[] array){
        int[] output = new int[array.length];
        Arrays.fill(output, 1);
        int left =1;
        int right =1;
        for (int i = 0; i < array.length; i++) {
            output[i] = output[i] * left;
            left = array[i] * left;
        }
        for (int i = array.length-1; i >=0 ; i--) {
            output[i] = output[i] * right;
            right = array[i] * right;
        }
        return output;
    }
}
