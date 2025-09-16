package maximumSubArray;

public class KadaneAlgorithm {
    /*
    * Kadane's Algorithm is a dynamic programming approach used to find
    * the maximum sum of a contiguous subarray within a given array of numbers.
    *  It efficiently solves the "Maximum Subarray Problem" in linear time, O(n)*/
    //It basically states that small +ve and big -ve number always results in negative ans which cannot
    //give us max sum so we should set our current sum to zero at that time and move ahead

    public static int maxSum(int[] nums){
        int maxSum=Integer.MIN_VALUE;
        int currentSum=0;
        for(int i=0;i<nums.length;i++){
            currentSum+=nums[i];
            maxSum=Math.max(currentSum,maxSum);
            if(currentSum<0){
                currentSum=0;
            }
        }
        return maxSum;
    }

}
