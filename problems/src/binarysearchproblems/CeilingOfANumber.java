package binarysearchproblems;

//ceiling of the problem is to return the number is which is equal or smallest to the given number.
public class CeilingOfANumber {

    public int findCeilingNumber(int []array, int target){
        int low = 0;
        int high = array.length-1;
        while (low<=high){
            int middle = low + (high-low)/2;
            if (array[middle] == target){
                return array[middle];
            }
            if (array[middle]<target){
                low = middle+1;
            }else {
                high = middle-1;
            }
        }
        return array[low];
    }

    public static void main(String[] args) {
        CeilingOfANumber ceilingOfTheNumber = new CeilingOfANumber();
        int[] array = {10,20,30,40,50,60};
        try {
            int target = 70;
            int ceilingNumber = ceilingOfTheNumber.findCeilingNumber(array, target);
            System.out.println("The Ceiling of the Number is " + ceilingNumber);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("No sealing Exist");
        }
    }
}
