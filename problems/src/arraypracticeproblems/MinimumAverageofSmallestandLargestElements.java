package arraypracticeproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAverageofSmallestandLargestElements {
    public static void main(String[] args) {
        int[] array = {1,2,3,7,8,9};
        System.out.println(minimumAverage(array));
    }

    public static double minimumAverage(int[] array){
        Arrays.sort(array);
        List<Double> list = new ArrayList<>();
        int i =0;
        int j = array.length-1;
        while(i<j){
            double c = (double) (array[i] + array[j]) / 2;
            list.add(c);
            i++;
            j--;
        }
        double[] newList = new double[list.size()];
        int index = 0;
        for (double num : list){
            newList[index++] = num;
        }
        Arrays.sort(newList);
        return newList[0];
    }
}
