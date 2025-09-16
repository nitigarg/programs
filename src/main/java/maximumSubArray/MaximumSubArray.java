package maximumSubArray;
/*Leetcode problem 53
*Given an integer array nums, find the subarray with the largest sum, and return its sum.
* */
public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        int maxSum=nums[0];
        int currentSum=nums[0];

        for(int i=1;i<nums.length;i++){
            currentSum=Math.max(nums[i],currentSum+nums[i]);
            maxSum=Math.max(currentSum,maxSum);
        }
        return maxSum;
    }
}
