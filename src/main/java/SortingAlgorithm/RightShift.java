package SortingAlgorithm;

import java.util.Arrays;

public class RightShift {
    public static int[] rightShift(int[] nums){
        int n=nums.length;
        //for right shift store the last element
        int temp=nums[n-1];
        for(int i=n-1;i>0;i--){
          nums[i]=nums[i-1];
        }
        nums[0]=temp;
        return nums;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
        rightShift(nums);
        System.out.println(Arrays.toString(nums));
    }
    //shift by K position
    public static int[] rightShiftByKPositions(int[]nums, int k){
        int n=nums.length;
        int temp[]=new int[k];
        //first we will store last k elements in temp array
        for(int i=0;i<k;i++){
            temp[i]=nums[n-k+i];
        }
        //step 2 Shift remaining elements
        for(int i=n-k-1;i>=0;i--){
            nums[i+k]=nums[i];
        }
        //step 3 put last element at beginning
        for(int i=0;i<k;i++){
            nums[i]=temp[i];
        }
        return nums;
    }
}
