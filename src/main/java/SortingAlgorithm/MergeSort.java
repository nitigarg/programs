package SortingAlgorithm;

import java.util.Arrays;

public class MergeSort {
//divide and conquer
    //best and worst case complexity is O(nlogn)
    public static void divide(int[] nums, int si, int ei){
        //base case
        if(si>=ei){
           return;
        }
        int mid=si+(ei-si)/2;
        divide(nums,si ,mid);
        divide(nums,mid+1,ei);
        conquer(nums,si,mid,ei);
    }
    public static void conquer(int[] nums,int si,int mid,int ei){
        //merge sorted array of two halves i.e. left and right
        int[] merged=new int[ei-si+1];
        int index_of_firstHalf=si;
        int index_of_secondHalf=mid+1;
        int index_of_merged_array=0;
        while(index_of_firstHalf<=mid && index_of_secondHalf<=ei){
                if(nums[index_of_firstHalf]<=nums[index_of_secondHalf]){
                    merged[index_of_merged_array++]=nums[index_of_firstHalf++];
                }else{
                    merged[index_of_merged_array++]=nums[index_of_secondHalf++];
                }
        }
        while(index_of_firstHalf<=mid){
            merged[index_of_merged_array++]=nums[index_of_firstHalf++];
        }
        while(index_of_secondHalf<=ei){
            merged[index_of_merged_array++]=nums[index_of_secondHalf++];
        }
       for(int i=0,x=si;i<merged.length;i++,x++){
            nums[x]=merged[i];
       }
    }

    public static void main(String[] args) {
        int[] nums={3,5,6,2,3,1};
        int n=nums.length;
        divide(nums,0,n-1);
        Arrays.stream(nums).forEach(e->System.out.print(e+" "));
    }
}
