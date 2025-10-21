package recursion;

public class StrictlyIncreasing {
    //find if the array is sorted and strictly increasing
    public static boolean isSortedAndStrictlyIncreasing(int[] nums,int idx){
        //base case
        if(idx==nums.length-1){
            return true;
        }
        //work to be done
        if(nums[idx]<nums[idx+1]){
            //recursive call
           return isSortedAndStrictlyIncreasing(nums,idx+1);
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7};
        boolean result=isSortedAndStrictlyIncreasing(nums,0);
        System.out.println("result is "+result);
    }
}
