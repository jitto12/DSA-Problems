package binarysearchproblems;

public class FindPositionInInfiniteArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int target = 15;
        System.out.println(ans(array,target));
    }

    static int ans(int[] array,int target){
        int start = 0;
        int end = 1;
        while(target>array[end]){
            int temp = end +1;
            end = end +(end-start+1)*2;
            start = temp;
        }
        return binarySearch(array,target,start,end);
    }

    public static int binarySearch(int arr[], int key, int low,int high){
        while (low<=high) {
            int mid = low+(high-low)/2;
            if (key < arr[mid]) {
                high = mid - 1;
            } else if (key > arr[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
