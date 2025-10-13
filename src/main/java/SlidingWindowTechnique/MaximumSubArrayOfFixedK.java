package SlidingWindowTechnique;

public class MaximumSubArrayOfFixedK {
    public int maxSum(int nums[],int k){
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        for(int i=k;i<nums.length;i++){
            sum+=nums[i]-nums[i-k];
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }
}
