package twodimensionalarray;

import java.util.Arrays;

public class SearchInSortedArray {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        int target = 0;
        int[] result = search(array,target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] search(int[][] array, int target){
        int r = 0;
        int c = array.length-1;
        while(r < array.length && c>=0){
            if (array[r][c] == target){
                return new int[]{r,c};
            }
            if (array[r][c]<target){
                r++;
            }else {
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
