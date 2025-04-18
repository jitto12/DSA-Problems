package binarysearchproblems;

public class HIndexII {
    public static int hIndex(int[] citations) {
        int n = citations.length;
        int left = 0, right = n;

        while (left < right) {
            int mid = (left + right) / 2;

            if (citations[mid] >= n - mid) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return n - left;
    }

    public static void main(String[] args) {
        int[]array = {2,4,6,8,10};
        System.out.println(hIndex(array));
    }
}
