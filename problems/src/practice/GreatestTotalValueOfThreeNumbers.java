package practice;

import java.util.Arrays;

public class GreatestTotalValueOfThreeNumbers {
    public static void main(String[] args) {
        int[] array = {33,22,55,44,6,77,88};
        System.out.println(greatestNumber(array));
    }

    static int greatestNumber(int [] array){
        Arrays.sort(array);
        int total = 0;
        if (array.length-1<=2){
            for (int i = 0; i <= array.length-1; i++) {
                total = array[i]+total;
            }
            return total;
        }else {
            for (int i = array.length-1; i >= array.length-1-2; i--) {
                total = array[i] + total;
            }
            return total;
        }
    }
}
