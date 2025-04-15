package arraypracticeproblems;

public class MinSubArrayLen {
    public static int minSubArrayLen(int target, int[] nums) {
        int i =0;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int j = 0; j < nums.length; j++) {
            sum = sum + nums[j];
            while(sum >= target){
                min = Math.min(min,j-i+1);
                sum = sum - nums[i];
                i++;
            }
        }
        if (min == Integer.MAX_VALUE){
            return 0;
        }else{
            return min;
        }
    }

    public static void main(String[] args) {
        int target = 15;
        int[] nums = {2,6,8,10,3,5,7};
        System.out.println(minSubArrayLen(target,nums));
    }
}

