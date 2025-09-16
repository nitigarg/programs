package SlidingWindowTechnique;

public class MinimumSizeSubArraySum {
    //leetcode 209
    public int minSubArrayLen(int target, int[] nums) {
        int start=0;
        int end=0;
        int currentSum=0;
        int minLength=Integer.MAX_VALUE;
        while(end<nums.length){
            currentSum+=nums[end];
            end++;
            while(currentSum>=target){
                minLength=Math.min(end-start,minLength);
                currentSum=currentSum-nums[start];
                start++;
            }
        }
        return minLength==Integer.MAX_VALUE?0:minLength;
    }
}
