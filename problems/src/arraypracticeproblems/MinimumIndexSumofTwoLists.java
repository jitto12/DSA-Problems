package arraypracticeproblems;

import java.util.*;

public class MinimumIndexSumofTwoLists {
    public static void main(String[] args) {
        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = {"KFC","Shogun","Burger King"};
        System.out.println(Arrays.toString(findRestaurant(list1,list2)));
    }

    public static String[] findRestaurant(String[] list1, String[] list2){
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i],i);
        }

        List<String> result = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < list2.length; i++) {
            String str = list2[i];
            if (map.containsKey(str)){
                int sum = i + map.get(str);
                if (sum<minSum){
                    result.clear();
                    result.add(str);
                    minSum = sum;
                } else if (sum == minSum){
                    result.add(str);
                }
            }
        }
        return result.toArray(new String[0]);
    }
}
