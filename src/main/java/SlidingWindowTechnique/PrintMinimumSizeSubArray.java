package SlidingWindowTechnique;

import java.util.Arrays;

public class PrintMinimumSizeSubArray {
    public static void minimumSubArray(int target,int nums[]){
        int start=0;
        int finalStart=0;
        int end=0;
        int minLength=Integer.MAX_VALUE;
        int currentSum=0;
        while(end<nums.length){
            currentSum+=nums[end];
            end++;
            while(currentSum>=target){
                if(minLength>end-start){
                    minLength=end-start;
                    finalStart=start;
                }
                currentSum-=nums[start];
                start++;
            }
        }
        System.out.println("Array of minimum length is " + Arrays.toString(Arrays.copyOfRange(nums,finalStart,finalStart+minLength)) );
    }
    public static void main(String args[]){
        int nums[]={2,3,1,2,4,3};
        int target=7;
        minimumSubArray(target,nums);
    }
}
