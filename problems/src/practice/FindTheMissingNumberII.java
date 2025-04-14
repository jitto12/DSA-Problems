package practice;

import java.util.*;

public class FindTheMissingNumberII {
    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(findDisappearedNumbers(nums));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}
