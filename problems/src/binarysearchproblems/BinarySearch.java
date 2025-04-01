package binarysearchproblems;

public class BinarySearch {

    public static int binarySearch(int arr[], int key){
        int low = 0;
        int high = arr.length-1;
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

    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6,7,8,9,10};
        int key=9;
        int result = binarySearch(num,key);
        if (result==-1){
            System.out.println("Element not Found..");
        }else {
            System.out.println("The Element "+key+" found in the Index "+result);
        }
    }
}
