package twodimensionalarray;

import java.util.Arrays;

public class SearchInSortedArray {
    public static void main(String[] args) {
        int[][] array = {{-1,3}};
        int target = 3;
        System.out.println(search1(array,target));
    }

    public static int[] search(int[][] array, int target){
        int r = 0;
        int c = array.length;
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

    public static boolean search1(int[][] array, int target){
        int r = 0;
        int c = array[0].length-1;
        while(r < array.length && c>=0){
            if (array[r][c] == target){
                return true;
            }
            if (array[r][c]<target){
                r++;
            }else {
                c--;
            }
        }
        return false;
    }
}
