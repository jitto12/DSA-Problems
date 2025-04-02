package binarysearchproblems;

public class BinarySearchInRotatedArray {

    public static void main(String[] args) {
        int[] array = {4,5,6,7,8,9,0,1,2};
        int target = 6;
        int result = search(array,target);
        System.out.println(result);
    }

    public static int search(int[] array, int target){
        int pivot = searchPivot(array);
        if (array[pivot]==-1){
            return binarySearch(array,target,0,array.length-1);
        }
        if (target==array[pivot]){
            return pivot;
        }
        if (target>array[0]){
            return binarySearch(array,target,0,pivot-1);
        }else {
            return binarySearch(array,target,pivot+1, array.length-1);
        }
    }

    public static int binarySearch(int arr[], int key, int low, int high){
        while (low<=high) {
            int mid = low+(high-low)/2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int searchPivot(int[] array){
        int start =0;
        int last = array.length-1;
        while (start<=last){
            int mid = start + (last-start)/2;
            if (mid<last && array[mid] > array[mid+1]){
                return mid;
            }
            if (mid>start && array[mid]<array[mid-1]){
                return mid-1;
            }
            if (start > array[mid]){
                last = mid-1;
            }else{
                start=mid;
            }
        }
        return -1;
    }
}
