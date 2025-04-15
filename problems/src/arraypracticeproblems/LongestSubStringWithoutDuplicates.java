package arraypracticeproblems;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutDuplicates {
    public static void main(String[] args) {
        String s = "abcabcdbb";
        System.out.println(longestString(s));
    }

    public static int longestString(String s) {
        int i = 0, j = 0, maxLength = 0;
        Set<Character> set = new HashSet<>();

        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                maxLength = Math.max(maxLength, j - i + 1);
                j++;
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }

        return maxLength;
    }
}
