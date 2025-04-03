package twodimensionalarray;

import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = 9;
        int[][] twoD = {{1,2,3},{4,5,6},{7,8,9}};
        printTwoDArray(twoD);
        System.out.println("Is the element is present :"+isPresent(twoD,target));
    }

    public static void printTwoDArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean isPresent(int[][] array, int target){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}
