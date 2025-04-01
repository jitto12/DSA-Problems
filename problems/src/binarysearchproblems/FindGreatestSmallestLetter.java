package binarysearchproblems;

public class FindGreatestSmallestLetter {

    public static char nextGreatestLetter(char[] letters, char target){
        int low = 0;
        int high = letters.length-1;
        while (low<=high){
            int mid = low + (high-low)/2;
            if (letters[mid]<target){
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return letters[low%letters.length];
    }

    public static void main(String[] args) {
        char[] letters = {'a','c','e','f'};
        char target = 'd';
        char result = nextGreatestLetter(letters,target);
        System.out.println(result);
    }
}
