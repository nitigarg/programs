package SortingAlgorithm;

import java.util.Arrays;

public class BubbleSort {
    public static int[] bubbleSort(int[] nums){
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                //swap if first element > second element
                if(nums[j]>nums[j+1]){
                   int temp=nums[j];
                   nums[j]=nums[j+1];
                   nums[j+1]=temp;
                }
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int [] nums= {3,5,7,2,1,7};
        System.out.println(Arrays.toString(bubbleSort(nums)));
    }
}
