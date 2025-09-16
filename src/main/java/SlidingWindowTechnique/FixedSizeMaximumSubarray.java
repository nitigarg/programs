package SlidingWindowTechnique;

public class FixedSizeMaximumSubarray {
    //Double.MIN_VALUE is a constant in Java's Double class that represents
    // the smallest positive nonzero value of type double.
    //It is important to note that this is not the smallest possible value
    // a double can hold, as double values can also be negative.
    // The smallest possible negative double value is -Double.MAX_VALUE.
    //leetcode 643
    public double findMaxAverage(int[] nums, int k) {
        long initialSum=0;

        for(int i=0;i<k;i++){
            initialSum=initialSum+nums[i] ;
        }
        long maxSum=initialSum;
        for(int i=k;i<nums.length;i++){
            initialSum=initialSum+nums[i]-nums[i-k];
            maxSum=Math.max(maxSum,initialSum);
        }
        return (double)maxSum/k;
    }
}
