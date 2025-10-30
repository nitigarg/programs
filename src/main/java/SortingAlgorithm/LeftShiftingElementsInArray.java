package SortingAlgorithm;

import java.util.Arrays;

public class LeftShiftingElementsInArray {
    public static int[] leftShift(int[] nums){
        int n=nums.length;
        //for left shifting-> starts with first element
        //store first element
        int temp=nums[0];
        for(int i=0;i<n-1;i++){
            nums[i]=nums[i+1];
        }
        nums[n-1]=temp;
        return nums;
    }

    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
        leftShift(nums);
        System.out.println(Arrays.toString(nums));
    }
    //if we want to shift k position
    public static int[] leftShiftByKPositions(int k, int nums[]){
        int n=nums.length;
        //Note cases in which k>n will be handled by using k%n logic
        //step 1: store first k elements
        int[] temp=new int[k];
        for(int i=0;i<k;i++){
            temp[i]=nums[i];
        }
        //step 2: Shift remanining elements to left
        for(int i=k;i<n;i++){
            nums[i-k]=nums[i];
        }
        //step 3 put stored elements at end
        for(int i=0;i<k;i++){
            nums[n-k+i]=temp[i];
        }
        return nums;
    }

}
