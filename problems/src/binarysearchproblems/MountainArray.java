package binarysearchproblems;

public class MountainArray {
    public static void main(String[] args) {
        int[]array = {1,2,3,5,6,4,3,2};
        int large = getLargeInMA(array);
        System.out.println(large);
    }

    static int getLargeInMA(int[] array){
        int low = 0;
        int high = array.length-1;
        while(low<high){
            int mid = low+ (high-low)/2;
            if (array[mid]>array[mid+1]){
                high = mid;
            }else {
                low = mid+1;
            }
        }
        return array[low];
    }
}
