package maximumSubArray;

public class BruteForceApproachOfMaximumSumSubArray {
    public static int maxSum(int [] nums){
        int maxSum=0;
        for(int start=0;start<nums.length;start++){
            int currentSum=0;
            for(int end=start;end<nums.length;end++){
               currentSum+=nums[end];
               maxSum=Math.max(currentSum,maxSum);
            }
        }
        return maxSum;
    }
    public static void main(String args[]){
        int[]nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSum(nums));
    }
}
