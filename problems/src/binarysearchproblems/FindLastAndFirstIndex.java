package binarysearchproblems;

import java.util.Arrays;

public class FindLastAndFirstIndex {
    public static void main(String[] args) {
        int[] nums = {5,8,8,8,10};
        int target = 8;
        FindLastAndFirstIndex findStartAndLastIndex = new FindLastAndFirstIndex();
        int [] result = findStartAndLastIndex.searchRange(nums,target);
        System.out.println(Arrays.toString(result));
    }

    public int[] searchRange(int[] nums ,int target){
        int[] ans ={-1,-1};
        int first = search(nums,target,true);
        int last = search(nums,target,false);
        ans[0] = first;
        ans[1] = last;
        return ans;
    }

    public int search(int[]nums, int target, boolean firstStartIndex){
        int ans = -1;
        int start = 0;
        int last = nums.length-1;
        while (start<=last){
            int mid = start+(last-start)/2;
            if (target<nums[mid]){
                last = mid-1;
            } else if (target>nums[mid]) {
                start = mid+1;
            }else {
                ans = mid;
                if (firstStartIndex){
                    last = mid-1;
                }else {
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
