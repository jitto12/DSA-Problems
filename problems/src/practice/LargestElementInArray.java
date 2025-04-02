package practice;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] array={8,6,2,1,10,7,3,4,5};
        int largest = largestElement(array);
        System.out.println(largest);
    }

    public static int largestElement(int[] array) {
        int i = 1;
        int largest = array[0];
        while (i <= array.length - 1) {
            if (array[i] > largest) {
                largest = array[i];
            }
            i++;
        }
        return largest;
    }
}
