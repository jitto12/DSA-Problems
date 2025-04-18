package twodimensionalarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TheKWeakestRowsinaMatrix {
    public static void main(String[] args) {
        int[][] array = {{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
        int k = 3;
        System.out.println(Arrays.toString(kWeakestRows(array,k)));
    }

    public static int[] kWeakestRows(int[][] mat, int k) {
        int[] result = new int[mat.length];
        for (int i = 0; i < mat.length; i++) {
            int j = mat[i].length-1;
            int total = 0;
            while (j>=0){
                total = total + mat[i][j];
                j--;
            }
            result[i] = total;
        }

        List<int[]> pairList = new ArrayList<>();
        for (int i = 0; i < result.length; i++) {
            pairList.add(new int[]{result[i], i});
        }

        pairList.sort(Comparator.comparingInt(a -> a[0]));

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = pairList.get(i)[1];
        }

        return res;
    }
}
