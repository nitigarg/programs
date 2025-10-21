package recursion;

public class LeetCode896 {
    public boolean isMonotonic(int[] nums) {
        return monotone(nums,0,0);
    }
    private static boolean monotone(int[]nums,int index,int trend){
        //base case
        if(index==nums.length-1){
            return true;
        }
        if(nums[index]==nums[index+1]){
            //equal values continue with same trend
            return monotone(nums,index+1,trend);
        }
        if(trend==0){
            trend=(nums[index]<nums[index+1])?1:-1;
            return monotone(nums,index+1,trend);
        }
        if(trend==1 && nums[index]>nums[index+1]){
            return false;
        }
        if(trend==-1&& nums[index]<nums[index+1]){
            return  false;
        }
        return  monotone(nums,index+1,trend);
    }
}
