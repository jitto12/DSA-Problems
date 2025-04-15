package arraypracticeproblems;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};
        System.out.println(containsDuplicate(numbers));
    }

    public static boolean containsDuplicate(int[] numbers){
        Set<Integer> seen = new HashSet<>();
        for (int num : numbers) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}
