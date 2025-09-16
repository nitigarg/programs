package SlidingWindowTechnique;

public class MinimumSizeSubArrayWithNegativeNumbers {
    //int[] nums = {2, -1, 2, 3, -2, 4, 3};
    //int target = 7;
    //output:Length: 4
    //Try to solve this with brute force and then optimise it
    public static int minimumSizeSubArray(int[] nums, int target){
        int minLength=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum=0;
          for(int j=i;j<nums.length;j++){
              sum=sum+nums[j];
              if(sum>=target){
                  minLength=Math.min(minLength,j-i+1);
              }
          }
        }
        return minLength==Integer.MAX_VALUE?0:minLength;
    }
   public static void main(String args[]){
       int[] nums = {2, -1, 2, 3, -2, 4, 3};
       int target = 7;
       System.out.println(minimumSizeSubArray(nums,target));
   }
}
