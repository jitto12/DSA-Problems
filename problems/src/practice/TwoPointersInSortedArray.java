package practice;

import java.util.Arrays;

public class TwoPointersInSortedArray {

    public int[] twoSum(int[] numbers, int target) {
        for(int i=1; i<numbers.length; i++){
            if(numbers[i] + numbers[i+1]== target){
                return new int[]{i,i+1};
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int [] numbers = {2,7,11,15};
        int target = 9;
        TwoPointersInSortedArray twoPointersInSortedArray = new TwoPointersInSortedArray();
        System.out.println(Arrays.toString(twoPointersInSortedArray.twoSum(numbers, target)));
    }
}
