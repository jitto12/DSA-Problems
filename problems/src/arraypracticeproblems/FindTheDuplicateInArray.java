package arraypracticeproblems;

import java.util.Arrays;

public class FindTheDuplicateInArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,77,77,7,8,9};
        System.out.println(findDuplicate(array));
    }

    public static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int low = 0;
        for (int high = 1; high < nums.length; high++) {
            if (nums[low] == nums[high]) {
                return nums[low];
            }
            low++;
        }
        return 0;
    }
}
